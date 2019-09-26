package br.com.fast.commons.util.singleton;

import java.util.LinkedHashMap;
import java.util.Map;

/***
 * @author Julio Escobar
 *         Singleton usado temporariamente para verificar o status da concessionaria.
 *         Posteriormente, usaremos um serviço de consulta.
 */

public class ConcessionariaSingleton {

    private Map<Integer, Integer> mapConcessionaria = new LinkedHashMap<Integer, Integer>();

    private ConcessionariaSingleton() {

        mapConcessionaria.put(1101, 0);
        mapConcessionaria.put(1102, 0);
        mapConcessionaria.put(1103, 1);
        mapConcessionaria.put(1104, 1);
        mapConcessionaria.put(1105, 1);

    }

    private static ConcessionariaSingleton concessionaria;

    public static ConcessionariaSingleton getInstance() {

        if (concessionaria == null)
            concessionaria = new ConcessionariaSingleton();

        return concessionaria;

    }

    public Map<Integer, Integer> getMapConcessionaria() {
        return mapConcessionaria;
    }
}
