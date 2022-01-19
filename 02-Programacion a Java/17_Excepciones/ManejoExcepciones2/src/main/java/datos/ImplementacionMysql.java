package datos;

import excepciones.*;

public class ImplementacionMysql implements AccesoDatos {
    
    private boolean simularError;

    public boolean isSimularError() {
        return simularError;
    }
    
    
    
    @Override
    public void insertar() throws AccesoDatosEx {
        if(simularError) {
            throw new EscrituraDatosEx("Error de escritura de datos.");
        } else {
            System.out.println("Insertar desde Mysql.");
        }
    }

    @Override
    public void listar() throws AccesoDatosEx {
        if(simularError) {
            throw new LecturaDatosEx("Error de escritura de datos.");
        } else {
            System.out.println("Listar desde Mysql.");
        }
    }

    @Override
    public void simularError(boolean simularError) {
        this.simularError = simularError;
    }
    
}
