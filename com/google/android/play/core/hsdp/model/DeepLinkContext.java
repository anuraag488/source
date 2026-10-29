package com.google.android.play.core.hsdp.model;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class DeepLinkContext {

    /* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
    public static abstract class Builder {
        public abstract DeepLinkContext build();

        public abstract Builder setCallerAppContext(CallerAppContext callerAppContext);

        public abstract Builder setTargetAppContext(TargetAppContext targetAppContext);
    }

    public static Builder builder() {
        return new C0537c();
    }

    public abstract CallerAppContext callerAppContext();

    public abstract TargetAppContext targetAppContext();
}
