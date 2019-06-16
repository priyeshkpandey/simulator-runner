package com.occ.sim.model;

import com.occ.entities.Emotion;
import com.occ.rules.infra.Rule;
import com.occ.rules.infra.RulesBuilder;
import com.occ.sim.utils.Generators;

public enum EmotionDefinition {

    ADMIRATION(RulesBuilder.buildAdmirationRule()),
    ANGER(RulesBuilder.buildAngerRule()),
    DISAPPOINTMENT(RulesBuilder.buildDisappointmentRule()),
    DISTRESS(RulesBuilder.buildDistressRule()),
    FEAR(RulesBuilder.buildFearRule()),
    FEARS_CONFIRMED(RulesBuilder.buildFearsConfirmedRule()),
    GLOATING(RulesBuilder.buildGloatingRule()),
    GRATIFICATION(RulesBuilder.buildGratificationRule()),
    GRATITUDE(RulesBuilder.buildGratitudeRule()),
    HAPPY_FOR(RulesBuilder.buildHappyForRule()),
    HATE(RulesBuilder.buildHateRule()),
    HOPE(RulesBuilder.buildHopeRule()),
    JOY(RulesBuilder.buildHopeRule()),
    LOVE(RulesBuilder.buildLoveRule()),
    PRIDE(RulesBuilder.buildPrideRule()),
    RELIEF(RulesBuilder.buildReliefRule()),
    REMORSE(RulesBuilder.buildRemorseRule()),
    REPROACH(RulesBuilder.buildReproachRule()),
    RESENTMENT(RulesBuilder.buildResentmentRule()),
    SATISFACTION(RulesBuilder.buildSatisfactionRule()),
    SHAME(RulesBuilder.buildShameRule()),
    SORRY_FOR(RulesBuilder.buildSorryForRule());

    private Rule rule;

    EmotionDefinition(Rule rule) {
        this.rule = rule;
    }

    public Emotion getEmotion() {
        return new Emotion(name(), this.rule, Math.abs(Generators.getDouble()));
    }
}
