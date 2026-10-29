package p000;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v3 fe1[], still in use, count: 1, list:
  (r0v3 fe1[]) from 0x009e: INVOKE (r0v3 fe1[]) STATIC call: vd6.r(java.lang.Enum[]):v91 A[MD:(java.lang.Enum[]):v91 (m), WRAPPED] (LINE:159)
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
public final class fe1 {
    /* JADX INFO: Fake field, exist only in values array */
    Primary(wd1.f33257c),
    PrimaryContainer(xd1.f34168c),
    /* JADX INFO: Fake field, exist only in values array */
    PrimaryFixed(yd1.f35126c),
    /* JADX INFO: Fake field, exist only in values array */
    PrimaryFixedDim(zd1.f35996c),
    /* JADX INFO: Fake field, exist only in values array */
    Secondary(ae1.f14403c),
    /* JADX INFO: Fake field, exist only in values array */
    SecondaryContainer(be1.f15223c),
    /* JADX INFO: Fake field, exist only in values array */
    SecondaryFixed(ce1.f15970c),
    /* JADX INFO: Fake field, exist only in values array */
    SecondaryFixedDim(de1.f17000c),
    /* JADX INFO: Fake field, exist only in values array */
    Tertiary(ee1.f18031c),
    /* JADX INFO: Fake field, exist only in values array */
    TertiaryContainer(rd1.f29183c),
    /* JADX INFO: Fake field, exist only in values array */
    TertiaryFixed(sd1.f30179c),
    /* JADX INFO: Fake field, exist only in values array */
    TertiaryFixedDim(td1.f31088c),
    /* JADX INFO: Fake field, exist only in values array */
    Background(ud1.f31792c),
    /* JADX INFO: Fake field, exist only in values array */
    SurfaceContainer(vd1.f32532c);


    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ v91 f18929d;

    /* JADX INFO: renamed from: a */
    public final yp1 f18930a;

    static {
        f18929d = vd6.m11859r(fe1VarArr);
    }

    public fe1(yp1 yp1Var) {
        super(str, i);
        this.f18930a = yp1Var;
    }

    public static fe1 valueOf(String str) {
        return (fe1) Enum.valueOf(fe1.class, str);
    }

    public static fe1[] values() {
        return (fe1[]) f18928c.clone();
    }
}
