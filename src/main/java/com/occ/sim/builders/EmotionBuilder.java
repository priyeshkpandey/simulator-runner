package com.occ.sim.builders;

import com.occ.entities.Emotion;
import com.occ.sim.model.EmotionDefinition;

import java.util.ArrayList;
import java.util.List;

public class EmotionBuilder {

    private List<Emotion> emotions;

    public EmotionBuilder fromAll() {
        this.emotions = new ArrayList<>();
        for (EmotionDefinition emotionDefinition : EmotionDefinition.values()) {
            this.emotions.add(emotionDefinition.getEmotion());
        }
        return this;
    }

    public List<Emotion> build() {
        return this.emotions;
    }

}
