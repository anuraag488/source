package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ut4 extends of4 implements mq1 {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ long f32159A;

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ a83 f32160B;

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ sw2 f32161C;

    /* JADX INFO: renamed from: t */
    public float f32162t;

    /* JADX INFO: renamed from: u */
    public float f32163u;

    /* JADX INFO: renamed from: v */
    public int f32164v;

    /* JADX INFO: renamed from: w */
    public byte f32165w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C0910mi f32166x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f32167y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ ky0 f32168z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ut4(C0910mi c0910mi, boolean z, ky0 ky0Var, long j, a83 a83Var, sw2 sw2Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f32166x = c0910mi;
        this.f32167y = z;
        this.f32168z = ky0Var;
        this.f32159A = j;
        this.f32160B = a83Var;
        this.f32161C = sw2Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        return new ut4(this.f32166x, this.f32167y, this.f32168z, this.f32159A, this.f32160B, this.f32161C, wm0Var);
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        return ((ut4) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4.f22634a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003b A[PHI: r0 r1 r2
  0x003b: PHI (r0v9 int) = (r0v15 int), (r0v16 int) binds: [B:28:0x0093, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE]
  0x003b: PHI (r1v5 float) = (r1v8 float), (r1v9 float) binds: [B:28:0x0093, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE]
  0x003b: PHI (r2v9 float) = (r2v13 float), (r2v14 float) binds: [B:28:0x0093, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0085 A[PHI: r0 r1 r2
  0x0085: PHI (r0v15 int) = (r0v6 int), (r0v8 int), (r0v20 int) binds: [B:26:0x0082, B:35:0x00cc, B:8:0x0015] A[DONT_GENERATE, DONT_INLINE]
  0x0085: PHI (r1v8 float) = (r1v2 float), (r1v4 float), (r1v11 float) binds: [B:26:0x0082, B:35:0x00cc, B:8:0x0015] A[DONT_GENERATE, DONT_INLINE]
  0x0085: PHI (r2v13 float) = (r2v7 float), (r2v8 float), (r2v16 float) binds: [B:26:0x0082, B:35:0x00cc, B:8:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00cc -> B:27:0x0085). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC0888lx
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ut4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
