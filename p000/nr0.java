package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public enum nr0 {
    CRONET_SOURCE_UNSPECIFIED("Unspecified"),
    CRONET_SOURCE_STATICALLY_LINKED("Statically Linked"),
    CRONET_SOURCE_PLAY_SERVICES("Play Services"),
    CRONET_SOURCE_FALLBACK("Fallback"),
    CRONET_SOURCE_PLATFORM("HttpEngine"),
    /* JADX INFO: Fake field, exist only in values array */
    CRONET_SOURCE_FAKE("Fake");


    /* JADX INFO: renamed from: a */
    public final String f26053a;

    nr0(String str) {
        this.f26053a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f26053a;
    }
}
