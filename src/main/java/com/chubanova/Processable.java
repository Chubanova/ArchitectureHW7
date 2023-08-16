package com.chubanova;

import lombok.Getter;

public interface Processable {
     boolean canContinue();

     void process();

}
