package atividadePratica2

import uml.Transaction

class ATM : Transaction{


    var keypad: Keypad
    var cashDispenser: CashDispenser
    var screen: Screen
    var depositslot: DepositSlot

    constructor(keypad: Keypad,cashDispenser: CashDispenser,screen: Screen,depositSlot: DepositSlot){
        this.keypad = keypad
        this.cashDispenser = cashDispenser
        this.screen = screen
        this.depositslot = depositSlot
    }
    private var userAuthenticated: Boolean? = false

    override fun execute() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}