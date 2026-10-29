package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class if0 extends bp3 implements mq1 {

    /* JADX INFO: renamed from: A */
    public long f21305A;

    /* JADX INFO: renamed from: B */
    public int f21306B;

    /* JADX INFO: renamed from: C */
    public int f21307C;

    /* JADX INFO: renamed from: D */
    public byte f21308D;

    /* JADX INFO: renamed from: E */
    public /* synthetic */ Object f21309E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ mx4 f21310F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ yp1 f21311G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ xn2 f21312H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ lf0 f21313I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ oq1 f21314J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ nq1 f21315K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ wp1 f21316L;

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ lv1 f21317M;

    /* JADX INFO: renamed from: u */
    public ml3 f21318u;

    /* JADX INFO: renamed from: v */
    public ml3 f21319v;

    /* JADX INFO: renamed from: w */
    public jx4 f21320w;

    /* JADX INFO: renamed from: x */
    public pl3 f21321x;

    /* JADX INFO: renamed from: y */
    public pl3 f21322y;

    /* JADX INFO: renamed from: z */
    public long f21323z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public if0(mx4 mx4Var, yp1 yp1Var, xn2 xn2Var, lf0 lf0Var, oq1 oq1Var, nq1 nq1Var, wp1 wp1Var, lv1 lv1Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f21310F = mx4Var;
        this.f21311G = yp1Var;
        this.f21312H = xn2Var;
        this.f21313I = lf0Var;
        this.f21314J = oq1Var;
        this.f21315K = nq1Var;
        this.f21316L = wp1Var;
        this.f21317M = lv1Var;
    }

    /* JADX INFO: renamed from: i */
    public static final void m6782i(wp1 wp1Var, pl3 pl3Var, lv1 lv1Var, dv1 dv1Var, boolean z) {
        long j = ((i41) wp1Var.invoke()).f21121a;
        if (!z || i41.m6645d(i41.m6651j(j, pl3Var.f27736a), as4.m3238Q(400, m41.MILLISECONDS)) > 0) {
            if (lv1Var != null) {
                lv1Var.m8115a(dv1Var);
            }
            pl3Var.f27736a = j;
        }
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        if0 if0Var = new if0(this.f21310F, this.f21311G, this.f21312H, this.f21313I, this.f21314J, this.f21315K, this.f21316L, this.f21317M, wm0Var);
        if0Var.f21309E = obj;
        return if0Var;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        return ((if0) create((wm0) obj2, (uf4) obj)).invokeSuspend(ju4.f22634a);
    }

    /* JADX WARN: Code duplicated, block: B:239:0x060e  */
    /* JADX WARN: Code duplicated, block: B:26:0x012b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0152 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0154  */
    /* JADX WARN: Code duplicated, block: B:32:0x016c  */
    /* JADX WARN: Code duplicated, block: B:34:0x017a  */
    /* JADX WARN: Code duplicated, block: B:36:0x017e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0188 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x018a  */
    /* JADX WARN: Code duplicated, block: B:41:0x019e  */
    /* JADX WARN: Code duplicated, block: B:44:0x01bd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x012b -> B:27:0x012f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC0888lx
    public final java.lang.Object invokeSuspend(java.lang.Object r49) {
        /*
            Method dump skipped, instruction units count: 1742
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.if0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
