package com.google.android.play.core.hsdp.model;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class TargetAppContext {

    /* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
    public static abstract class Builder {
        public abstract TargetAppContext build();
    }

    public static Builder builder() {
        return new C0543i();
    }

    public Map<String, String> toQueryParams() {
        return Collections.EMPTY_MAP;
    }
}
