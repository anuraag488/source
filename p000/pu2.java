package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pu2 extends of4 implements mq1 {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ ql3 f27998A;

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ float f27999B;

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ ru2 f28000C;

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ float f28001D;

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ vy3 f28002E;

    /* JADX INFO: renamed from: t */
    public ml3 f28003t;

    /* JADX INFO: renamed from: u */
    public ml3 f28004u;

    /* JADX INFO: renamed from: v */
    public int f28005v;

    /* JADX INFO: renamed from: w */
    public byte f28006w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f28007x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ nl3 f28008y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ ql3 f28009z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pu2(nl3 nl3Var, ql3 ql3Var, ql3 ql3Var2, float f, ru2 ru2Var, float f2, vy3 vy3Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f28008y = nl3Var;
        this.f28009z = ql3Var;
        this.f27998A = ql3Var2;
        this.f27999B = f;
        this.f28000C = ru2Var;
        this.f28001D = f2;
        this.f28002E = vy3Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        pu2 pu2Var = new pu2(this.f28008y, this.f28009z, this.f27998A, this.f27999B, this.f28000C, this.f28001D, this.f28002E, wm0Var);
        pu2Var.f28007x = obj;
        return pu2Var;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        return ((pu2) create((wm0) obj2, (ty3) obj)).invokeSuspend(ju4.f22634a);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x006c  */
    /* JADX WARN: Code duplicated, block: B:17:0x008c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0096  */
    /* JADX WARN: Code duplicated, block: B:22:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:23:0x00de  */
    /* JADX WARN: Code duplicated, block: B:27:0x0145  */
    /* JADX WARN: Code duplicated, block: B:30:0x014b A[EDGE_INSN: B:30:0x014b->B:31:0x014c BREAK  A[LOOP:0: B:13:0x0066->B:44:0x01a5]] */
    /* JADX WARN: Code duplicated, block: B:33:0x0150  */
    /* JADX WARN: Code duplicated, block: B:36:0x0171  */
    /* JADX WARN: Code duplicated, block: B:43:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:47:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x01a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x01b9 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0171 -> B:37:0x0173). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0185 -> B:38:0x0181). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC0888lx
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.pu2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
