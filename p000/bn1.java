package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bn1 extends bp3 implements mq1 {

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ byte f15430u;

    /* JADX INFO: renamed from: v */
    public byte f15431v;

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f15432w;

    /* JADX INFO: renamed from: x */
    public Object f15433x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f15434y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bn1(Object obj, Object obj2, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f15430u = b;
        this.f15433x = obj;
        this.f15434y = obj2;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f15430u;
        Object obj2 = this.f15434y;
        switch (b) {
            case 0:
                bn1 bn1Var = new bn1((ro0) this.f15433x, (mq1) obj2, wm0Var, (byte) 0);
                bn1Var.f15432w = obj;
                return bn1Var;
            case 1:
                bn1 bn1Var2 = new bn1((yj4) obj2, wm0Var);
                bn1Var2.f15432w = obj;
                return bn1Var2;
            default:
                bn1 bn1Var3 = new bn1((fc3) this.f15433x, (ql3) obj2, wm0Var, (byte) 2);
                bn1Var3.f15432w = obj;
                return bn1Var3;
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f15430u;
        ju4 ju4Var = ju4.f22634a;
        uf4 uf4Var = (uf4) obj;
        wm0 wm0Var = (wm0) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((bn1) create(wm0Var, uf4Var)).invokeSuspend(ju4Var);
    }

    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x01b5 A[Catch: CancellationException -> 0x019c, TRY_ENTER, TryCatch #0 {CancellationException -> 0x019c, blocks: (B:89:0x01b5, B:92:0x01c3, B:78:0x0198, B:83:0x01a3), top: B:103:0x017e }] */
    /* JADX WARN: Code duplicated, block: B:91:0x01c2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00ae -> B:35:0x00b2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0144 -> B:60:0x0148). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x01cd -> B:87:0x01af). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x01e0 -> B:87:0x01af). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC0888lx
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bn1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn1(yj4 yj4Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f15430u = (byte) 1;
        this.f15434y = yj4Var;
    }
}
