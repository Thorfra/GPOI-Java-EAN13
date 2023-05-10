/**
 *@author Francesco Tornese 5inf
 *@version 1.0.0
 *@since 10/05/2023
 */



public class EAN13 {
    /**
     * codice è una srringa che andrà a contenere il notro dato in questo caso un EAN
     */
    private String codice;

   /**
    * 
    * @param c è il dato a cui viene assengato "codice"
    */
    public void setCodice(String c){
        codice = c;
    }
    /**
     * 
     * @return ci fa ritornare il valore inserito in "codice"
     */
    public String getCodice(){
        return codice;
    }

    /**
     * qui abbiamo una procedura che controlla che il codice inserito sia vuoto oppure non valido
     * @return questa procedura ritorna false se il dato inserito ha valore diverso da 13
     */
    public boolean verificaCodice(){

        // Verifica se l'attributo codice è vuoto o nullo
        if (codice.equals(null) || codice == ""){
            throw new NullPointerException("Il codice EAN-13 risulta vuoto o nullo");
        }

        // Verifica se la lunghezza dell'attributo codice è di 13
        if(codice.length() != 13) {
            return false;
        }
        
        // Implementazione dell'algoritmo di calcolo della cifra di controllo
        int somma = 0;
        int cifra;
        
        for(int i = 0; i < codice.length() - 1; i++) {   
            cifra = Character.getNumericValue(codice.charAt(i));
            
            if(i % 2 == 0) {
                somma += cifra * 1;  
            } else {
                somma += cifra * 3; 
            }
        }
        
        // Calcola la cifra di controllo
        int cifraDiControllo = (10 - (somma % 10));

        // Confronta la cifra di controllo con quella contenuta nel codice EAN13 (ultima cifra)
        return cifraDiControllo == Character.getNumericValue(codice.charAt(12)); 
    }


}
