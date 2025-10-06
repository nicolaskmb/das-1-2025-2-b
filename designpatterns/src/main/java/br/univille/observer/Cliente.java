package br.univille.observer;

public class Cliente {
    public static void main(String[] args) {
        var grupoFamilia = new Publisher();

        var nicolas = new ConcreteSubscriber();
        var thales = new ConcreteSubscriber();
        var vlad = new ConcreteSubscriber();

        grupoFamilia.subscribe(nicolas);
        grupoFamilia.subscribe(thales);
        grupoFamilia.subscribe(vlad);

        grupoFamilia.setMainState("VÃO DORMIR SEUS PAMONHAS!");
        grupoFamilia.notifySubscribers();

    }
}