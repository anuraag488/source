package p000;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 bk2[], still in use, count: 1, list:
  (r0v1 bk2[]) from 0x0036: INVOKE (r0v1 bk2[]) STATIC call: vd6.r(java.lang.Enum[]):v91 A[MD:(java.lang.Enum[]):v91 (m), WRAPPED] (LINE:55)
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
public final class bk2 {
    OBJ('{', '}'),
    LIST('[', ']'),
    MAP('{', '}'),
    POLY_OBJ('[', ']');


    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ v91 f15360h;

    /* JADX INFO: renamed from: a */
    public final char f15361a;

    /* JADX INFO: renamed from: b */
    public final char f15362b;

    static {
        f15360h = vd6.m11859r(bk2VarArr);
    }

    public bk2(char c, char c2) {
        super(str, i);
        this.f15361a = c;
        this.f15362b = c2;
    }

    public static bk2 valueOf(String str) {
        return (bk2) Enum.valueOf(bk2.class, str);
    }

    public static bk2[] values() {
        return (bk2[]) f15359g.clone();
    }
}
