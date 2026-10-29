package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class eh4 extends bp3 implements mq1 {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ nh4 f18093A;

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ ml3 f18094B;

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ C1354y3 f18095C;

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ zo0 f18096D;

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ sw2 f18097E;

    /* JADX INFO: renamed from: u */
    public lc3 f18098u;

    /* JADX INFO: renamed from: v */
    public List f18099v;

    /* JADX INFO: renamed from: w */
    public lc3 f18100w;

    /* JADX INFO: renamed from: x */
    public int f18101x;

    /* JADX INFO: renamed from: y */
    public byte f18102y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f18103z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh4(nh4 nh4Var, ml3 ml3Var, C1354y3 c1354y3, zo0 zo0Var, sw2 sw2Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f18093A = nh4Var;
        this.f18094B = ml3Var;
        this.f18095C = c1354y3;
        this.f18096D = zo0Var;
        this.f18097E = sw2Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        eh4 eh4Var = new eh4(this.f18093A, this.f18094B, this.f18095C, this.f18096D, this.f18097E, wm0Var);
        eh4Var.f18103z = obj;
        return eh4Var;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        return ((eh4) create((wm0) obj2, (uf4) obj)).invokeSuspend(ju4.f22634a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x009b  */
    /* JADX WARN: Code duplicated, block: B:27:0x00af A[LOOP:0: B:22:0x0095->B:27:0x00af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b7 A[EDGE_INSN: B:56:0x00b7->B:29:0x00b7 BREAK  A[LOOP:0: B:22:0x0095->B:27:0x00af], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [int] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0088 -> B:21:0x008b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC0888lx
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.eh4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
