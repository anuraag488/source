package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qj2 extends t73 {

    /* JADX INFO: renamed from: a */
    public String f28524a;

    /* JADX INFO: renamed from: b */
    public j63 f28525b;

    @Override // p000.t73
    /* JADX INFO: renamed from: a */
    public final boolean mo5593a() {
        return this.f28525b != j63.f22047e;
    }

    public final String toString() {
        String str;
        String str2 = this.f28524a;
        int iOrdinal = this.f28525b.ordinal();
        if (iOrdinal == 1) {
            str = "TINK";
        } else if (iOrdinal == 2) {
            str = "LEGACY";
        } else if (iOrdinal != 3) {
            str = iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY";
        } else {
            str = "RAW";
        }
        return zi4.m13622v("(typeUrl=", str2, ", outputPrefixType=", str, ")");
    }
}
