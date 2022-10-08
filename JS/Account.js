class Account{
    constructor(name, document){
        this.id;
        this.name = name;
        this.document = document;
        this.email;
        this.password;
    }
    printAccountDatils(){
        console.group("Account");
        console.table(this.name, this.document);
        console.groupEnd("Account");
    }
}

