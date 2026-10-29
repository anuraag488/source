package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class p14 {

    /* JADX INFO: renamed from: a */
    public final String f27292a;

    /* JADX INFO: renamed from: b */
    public final mq1 f27293b;

    /* JADX INFO: renamed from: c */
    public final boolean f27294c;

    public /* synthetic */ p14(String str) {
        this(str, new n14((byte) 1));
    }

    public final String toString() {
        return zi4.m13620t("AccessibilityKey: ", this.f27292a);
    }

    public p14(String str, mq1 mq1Var) {
        this.f27292a = str;
        this.f27293b = mq1Var;
    }

    public p14(String str, int i) {
        this(str);
        this.f27294c = true;
    }

    public p14(String str, boolean z, mq1 mq1Var) {
        this(str, mq1Var);
        this.f27294c = z;
    }
}
