package p000;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 lr2[], still in use, count: 1, list:
  (r0v1 lr2[]) from 0x003f: INVOKE (r0v1 lr2[]) STATIC call: vd6.r(java.lang.Enum[]):v91 A[MD:(java.lang.Enum[]):v91 (m), WRAPPED] (LINE:64)
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
public final class lr2 {
    /* JADX INFO: Fake field, exist only in values array */
    PlayPause(new kr2((byte) 0), new kr2((byte) 1)),
    /* JADX INFO: Fake field, exist only in values array */
    SkipNext(new kr2((byte) 2), new kr2((byte) 3)),
    /* JADX INFO: Fake field, exist only in values array */
    SkipPrevious(new kr2((byte) 4), new kr2((byte) 5));


    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ v91 f24313d;

    /* JADX INFO: renamed from: a */
    public final yp1 f24314a;

    /* JADX INFO: renamed from: b */
    public final yp1 f24315b;

    static {
        f24313d = vd6.m11859r(lr2VarArr);
    }

    public lr2(yp1 yp1Var, yp1 yp1Var2) {
        super(str, i);
        this.f24314a = yp1Var;
        this.f24315b = yp1Var2;
    }

    public static lr2 valueOf(String str) {
        return (lr2) Enum.valueOf(lr2.class, str);
    }

    public static lr2[] values() {
        return (lr2[]) f24312c.clone();
    }
}
