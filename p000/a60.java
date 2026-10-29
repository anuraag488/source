package p000;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a60[], still in use, count: 1, list:
  (r0v1 a60[]) from 0x002a: INVOKE (r0v1 a60[]) STATIC call: vd6.r(java.lang.Enum[]):v91 A[MD:(java.lang.Enum[]):v91 (m)] (LINE:43)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(Unknown Source)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class a60 {
    ENABLED(true, true),
    /* JADX INFO: Fake field, exist only in values array */
    READ_ONLY(true, false),
    /* JADX INFO: Fake field, exist only in values array */
    WRITE_ONLY(false, true),
    DISABLED(false, false);


    /* JADX INFO: renamed from: a */
    public final boolean f127a;

    /* JADX INFO: renamed from: b */
    public final boolean f128b;

    static {
        vd6.m11859r(a60VarArr);
    }

    public a60(boolean z, boolean z2) {
        super(str, i);
        this.f127a = z;
        this.f128b = z2;
    }

    public static a60 valueOf(String str) {
        return (a60) Enum.valueOf(a60.class, str);
    }

    public static a60[] values() {
        return (a60[]) f126e.clone();
    }
}
