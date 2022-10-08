
class User extends Account{
    constructor(id, name, document, email){
        super(name, document);
        this.email = email;
    }
}