package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class mb3 {

    /* JADX INFO: renamed from: a */
    public boolean f24799a;

    /* JADX INFO: renamed from: b */
    public int f24800b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mb3)) {
            return false;
        }
        mb3 mb3Var = (mb3) obj;
        return this.f24799a == mb3Var.f24799a && this.f24800b == mb3Var.f24800b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f24800b) + (Boolean.hashCode(this.f24799a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f24799a + ", emojiSupportMatch=" + m71.m8214a(this.f24800b) + ")";
    }
}
