public class ContactList{
    private Contact[] contacts;
    private int count;

    public ContactList(){
        this.contacts = new Contact[2];
        this.count = 0;
    }
    public void add(Contact c){
        if (count == contacts.length){
            System.out.println("Redimensionando o array de contatos...");

            Contact[] newArray = new Contact[contacts.length * 2];

            for (int i = 0; i < contacts.length; i++){
                newArray[i] = contacts[i];
            }
            
            this.contacts = newArray;
            System.out.println("Todos os contatos foram copiados!");
        }

        contacts[count] = c;
        count++;

    }

        // Copia as referências dos objetos para o novo array.
        // Isso garante que os objetos originais não sejam coletados pelo
        // Garbage Collector, pois continuam referenciados.

        public void printAll() {
            System.out.println("Lista de Contatos:\n");
            for (int i  = 0; i < count; i++){
                System.out.println("Nome do contato: " + contacts[i].name);
                System.out.println("Número do contato: " + contacts[i].phone);
            }
            System.out.println("---------------------------------\n");
        }

        public void showReferences() {
            System.out.println("Referencia dos Contatos:\n");
            for (int i = 0; i < count; i++){
                System.out.println(contacts[i]);
            }
            System.out.println("----------------\n");
        }

        // Imprime o endereço de memória de cada contato na lista.

            public static void main(String[] args){
            ContactList List = new ContactList();

            //Adicionando os contatos usados

            Contact contact1 = new Contact("Sofia Oliveira" , "+55 (81) 99876-5432");
            Contact contact2 = new Contact("Arthur Costa" , "+55 (81) 98765-4321"); 
            Contact contact3 = new Contact("Júlia Pereira" , "+55 (81) 99123-4567");
            Contact contact4 = new Contact("Lucas Martins" , "+55 (81) 98234-5678");
            Contact contact5 = new Contact("Isabella Santos" , "+55 (81) 99345-6789");
            Contact contact6 = new Contact("Miguel Souza" , "+55 (81) 98456-7890");
            
            List.add(contact1);
            List.add(contact2);
            List.printAll();
            List.showReferences();
            
            List.add(contact3);
            List.add(contact4);
            System.out.println(List.contacts.length);

            List.add(contact5);
            List.add(contact6);
            System.out.println(List.contacts.length);
            List.printAll();
            List.showReferences();
                        
        }
    }