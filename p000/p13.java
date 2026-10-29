package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class p13 extends bp3 implements mq1 {

    /* JADX INFO: renamed from: u */
    public Object f27288u;

    /* JADX INFO: renamed from: v */
    public boolean f27289v;

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f27290w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ wp1 f27291x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p13(wp1 wp1Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f27291x = wp1Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        p13 p13Var = new p13(this.f27291x, wm0Var);
        p13Var.f27290w = obj;
        return p13Var;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        return ((p13) create((wm0) obj2, (b24) obj)).invokeSuspend(ju4.f22634a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0036  */
    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0036 -> B:14:0x0037). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:13:0x0036
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC0888lx
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            ap0 r0 = p000.ap0.f14763a
            boolean r1 = r5.f27289v
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1a
            if (r1 != r3) goto L14
            java.lang.Object r1 = r5.f27288u
            java.lang.Object r4 = r5.f27290w
            b24 r4 = (p000.b24) r4
            p000.k43.m7376J(r6)
            goto L37
        L14:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1077qn.m9989o(r5)
            return r2
        L1a:
            p000.k43.m7376J(r6)
            java.lang.Object r6 = r5.f27290w
            b24 r6 = (p000.b24) r6
            r4 = r6
        L22:
            wp1 r6 = r5.f27291x
            java.lang.Object r6 = r6.invoke()
            if (r6 == 0) goto L36
            r5.f27290w = r4
            r5.f27288u = r6
            r5.f27289v = r3
            r4.m3411c(r6, r5)
            ap0 r5 = p000.ap0.f14763a
            return r0
        L36:
            r1 = r2
        L37:
            if (r1 != 0) goto L22
            ju4 r5 = p000.ju4.f22634a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.p13.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
