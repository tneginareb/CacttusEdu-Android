package com.gentb.cacttusedu.network;

import com.gentb.cacttusedu.models.Lenda;

import java.util.ArrayList;

/**
 * Created by gentberani on 12/18/17.
 */

public interface LendetCallback {
    void onLendetResponse(final ArrayList<Lenda> lendet, boolean success);
}
