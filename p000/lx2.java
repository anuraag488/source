package p000;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 lx2[], still in use, count: 1, list:
  (r0v1 lx2[]) from 0x0029: INVOKE (r0v1 lx2[]) STATIC call: vd6.r(java.lang.Enum[]):v91 A[MD:(java.lang.Enum[]):v91 (m)] (LINE:42)
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
public final class lx2 {
    /* JADX INFO: Fake field, exist only in values array */
    EF6(1),
    /* JADX INFO: Fake field, exist only in values array */
    EF14(2),
    /* JADX INFO: Fake field, exist only in values array */
    EF22(4),
    /* JADX INFO: Fake field, exist only in values array */
    EF32(8);


    /* JADX INFO: renamed from: a */
    public final byte f24436a;

    static {
        vd6.m11859r(lx2VarArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public lx2(int i) {
        super(str, i);
        this.f24436a = i;
    }

    public static lx2[] values() {
        return (lx2[]) f24435b.clone();
    }
}
