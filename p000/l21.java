package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class l21 extends bp3 implements mq1 {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ ql3 f23723A;

    /* JADX INFO: renamed from: u */
    public ec3 f23724u;

    /* JADX INFO: renamed from: v */
    public int f23725v;

    /* JADX INFO: renamed from: w */
    public byte f23726w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f23727x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ ml3 f23728y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ ql3 f23729z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l21(ml3 ml3Var, ql3 ql3Var, ql3 ql3Var2, wm0 wm0Var) {
        super(2, wm0Var);
        this.f23728y = ml3Var;
        this.f23729z = ql3Var;
        this.f23723A = ql3Var2;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        l21 l21Var = new l21(this.f23728y, this.f23729z, this.f23723A, wm0Var);
        l21Var.f23727x = obj;
        return l21Var;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        return ((l21) create((wm0) obj2, (uf4) obj)).invokeSuspend(ju4.f22634a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005b  */
    /* JADX WARN: Code duplicated, block: B:20:0x0068 A[LOOP:2: B:16:0x0059->B:20:0x0068, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x006b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x006c A[EDGE_INSN: B:74:0x006c->B:22:0x006c BREAK  A[LOOP:2: B:16:0x0059->B:20:0x0068], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [int] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00b5 -> B:39:0x00b8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC0888lx
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.l21.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
