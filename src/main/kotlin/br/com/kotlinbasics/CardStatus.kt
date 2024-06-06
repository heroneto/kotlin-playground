package br.com.kotlinbasics

data class CardStatus(
    val cardStatus: CardStatus
) {

    enum class CardStatus {
        BLOCKED,
        BROKEN,
        PENDING
    }
}
