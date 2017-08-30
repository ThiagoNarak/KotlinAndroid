package atividadePratica2

import atividadePratica2.Interface.Transaction

class BankDatabase:Transaction {
    var account:Account? = null

    constructor(account: Account){
      this.account = account
    }
    constructor(){}




    override fun execute() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    fun authenticateUser():Boolean{
        return false
    }
    fun getAvailableBalance():Double{return 0.0}
    fun getTotalBalance():Double{return 0.0}
    fun credit(){}
    fun debit(){}
}