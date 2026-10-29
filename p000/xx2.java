package p000;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 xx2[], still in use, count: 1, list:
  (r0v1 xx2[]) from 0x0042: INVOKE (r0v1 xx2[]) STATIC call: vd6.r(java.lang.Enum[]):v91 A[MD:(java.lang.Enum[]):v91 (m), WRAPPED] (LINE:67)
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
public final class xx2 {
    SwipeLeft("Swipe left", (g12) n02.f25360c.getValue()),
    SwipeUp("Swipe up", (g12) n02.f25364g.getValue()),
    SwipeRight("Swipe right", (g12) n02.f25362e.getValue());


    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ v91 f34695g;

    /* JADX INFO: renamed from: a */
    public final String f34696a;

    /* JADX INFO: renamed from: b */
    public final g12 f34697b;

    static {
        f34695g = vd6.m11859r(xx2VarArr);
    }

    public xx2(String str, g12 g12Var) {
        super(str, i);
        this.f34696a = str;
        this.f34697b = g12Var;
    }

    public static xx2 valueOf(String str) {
        return (xx2) Enum.valueOf(xx2.class, str);
    }

    public static xx2[] values() {
        return (xx2[]) f34694f.clone();
    }
}
