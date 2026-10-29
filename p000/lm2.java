package p000;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 lm2[], still in use, count: 1, list:
  (r0v1 lm2[]) from 0x0079: INVOKE (r0v1 lm2[]) STATIC call: vd6.r(java.lang.Enum[]):v91 A[MD:(java.lang.Enum[]):v91 (m)] (LINE:122)
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
public final class lm2 {
    f24159b(0),
    f24160c(1),
    f24161d(2),
    f24162e(3),
    f24163f(4),
    f24164g(5),
    /* JADX INFO: Fake field, exist only in values array */
    EF6(7),
    f24165h(8),
    f24166i(10),
    f24167j(11),
    f24168k(12);


    /* JADX INFO: renamed from: a */
    public final byte f24170a;

    static {
        vd6.m11859r(lm2VarArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public lm2(int i) {
        super(str, i);
        this.f24170a = i;
    }

    public static lm2[] values() {
        return (lm2[]) f24169l.clone();
    }
}
