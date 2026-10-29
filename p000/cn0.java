package p000;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 cn0[], still in use, count: 1, list:
  (r0v1 cn0[]) from 0x002e: INVOKE (r0v1 cn0[]) STATIC call: vd6.r(java.lang.Enum[]):v91 A[MD:(java.lang.Enum[]):v91 (m)] (LINE:47)
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
public final class cn0 {
    WCAG_AA_NORMAL_TEXT(4.5d),
    /* JADX INFO: Fake field, exist only in values array */
    WCAG_AA_LARGE_TEXT(3.0d),
    /* JADX INFO: Fake field, exist only in values array */
    WCAG_AAA_NORMAL_TEXT(7.0d),
    /* JADX INFO: Fake field, exist only in values array */
    WCAG_AAA_LARGE_TEXT(4.5d);


    /* JADX INFO: renamed from: a */
    public final double f16135a;

    static {
        vd6.m11859r(cn0VarArr);
    }

    public cn0(double d) {
        super(str, i);
        this.f16135a = d;
    }

    public static cn0 valueOf(String str) {
        return (cn0) Enum.valueOf(cn0.class, str);
    }

    public static cn0[] values() {
        return (cn0[]) f16134c.clone();
    }
}
