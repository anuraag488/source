package p000;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ng3[], still in use, count: 1, list:
  (r0v1 ng3[]) from 0x001e: INVOKE (r0v1 ng3[]) STATIC call: vd6.r(java.lang.Enum[]):v91 A[MD:(java.lang.Enum[]):v91 (m)] (LINE:31)
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
public final class ng3 {
    InApp("inapp"),
    Subs("subs");


    /* JADX INFO: renamed from: a */
    public final String f25775a;

    static {
        vd6.m11859r(ng3VarArr);
    }

    public ng3(String str) {
        super(str, i);
        this.f25775a = str;
    }

    public static ng3 valueOf(String str) {
        return (ng3) Enum.valueOf(ng3.class, str);
    }

    public static ng3[] values() {
        return (ng3[]) f25774d.clone();
    }
}
