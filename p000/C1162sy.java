package p000;

/* JADX INFO: renamed from: sy */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1162sy extends bp3 implements mq1 {

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ byte f30640u;

    /* JADX INFO: renamed from: v */
    public boolean f30641v;

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f30642w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f30643x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1162sy(Object obj, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f30640u = b;
        this.f30643x = obj;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f30640u;
        Object obj2 = this.f30643x;
        switch (b) {
            case 0:
                C1162sy c1162sy = new C1162sy((fc3) obj2, wm0Var, (byte) 0);
                c1162sy.f30642w = obj;
                return c1162sy;
            case 1:
                C1162sy c1162sy2 = new C1162sy((qw2) obj2, wm0Var, (byte) 1);
                c1162sy2.f30642w = obj;
                return c1162sy2;
            default:
                C1162sy c1162sy3 = new C1162sy((zn0) obj2, wm0Var, (byte) 2);
                c1162sy3.f30642w = obj;
                return c1162sy3;
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f30640u;
        ju4 ju4Var = ju4.f22634a;
        uf4 uf4Var = (uf4) obj;
        wm0 wm0Var = (wm0) obj2;
        switch (b) {
            case 0:
                return ((C1162sy) create(wm0Var, uf4Var)).invokeSuspend(ju4Var);
            case 1:
                return ((C1162sy) create(wm0Var, uf4Var)).invokeSuspend(ju4Var);
            default:
                ((C1162sy) create(wm0Var, uf4Var)).invokeSuspend(ju4Var);
                return ap0.f14763a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0031 -> B:14:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:12:0x0033
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC0888lx
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            byte r0 = r7.f30640u
            java.lang.Object r1 = r7.f30643x
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r3 = 1
            r4 = 0
            switch(r0) {
                case 0: goto L73;
                case 1: goto L47;
                default: goto Lb;
            }
        Lb:
            ap0 r0 = p000.ap0.f14763a
            boolean r5 = r7.f30641v
            if (r5 == 0) goto L1f
            if (r5 != r3) goto L1b
            java.lang.Object r2 = r7.f30642w
            uf4 r2 = (p000.uf4) r2
            p000.k43.m7376J(r8)
            goto L35
        L1b:
            p000.C1077qn.m9989o(r2)
            goto L34
        L1f:
            p000.k43.m7376J(r8)
            java.lang.Object r8 = r7.f30642w
            uf4 r8 = (p000.uf4) r8
            r2 = r8
        L27:
            fc3 r8 = p000.fc3.f18903a
            r7.f30642w = r2
            r7.f30641v = r3
            java.lang.Object r8 = r2.m11538a(r8, r7)
            if (r8 != r0) goto L35
            r4 = r0
        L34:
            return r4
        L35:
            ec3 r8 = (p000.ec3) r8
            r4 = r1
            zn0 r4 = (p000.zn0) r4
            boolean r8 = p000.w04.m12040a(r8)
            r8 = r8 ^ r3
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r4.invoke(r8)
            goto L27
        L47:
            java.lang.Object r0 = r7.f30642w
            uf4 r0 = (p000.uf4) r0
            ap0 r5 = p000.ap0.f14763a
            boolean r6 = r7.f30641v
            if (r6 == 0) goto L5b
            if (r6 != r3) goto L57
            p000.k43.m7376J(r8)
            goto L6b
        L57:
            p000.C1077qn.m9989o(r2)
            goto L72
        L5b:
            p000.k43.m7376J(r8)
            r7.f30642w = r4
            r7.f30641v = r3
            r8 = 2
            java.lang.Object r7 = p000.fi4.m5718b(r0, r7, r8)
            if (r7 != r5) goto L6b
            r4 = r5
            goto L72
        L6b:
            qw2 r1 = (p000.qw2) r1
            ju4 r4 = p000.ju4.f22634a
            r1.mo197f(r4)
        L72:
            return r4
        L73:
            java.lang.Object r0 = r7.f30642w
            uf4 r0 = (p000.uf4) r0
            ap0 r5 = p000.ap0.f14763a
            boolean r6 = r7.f30641v
            if (r6 == 0) goto L88
            if (r6 != r3) goto L83
            p000.k43.m7376J(r8)
            goto L98
        L83:
            p000.C1077qn.m9989o(r2)
            r8 = r4
            goto L98
        L88:
            p000.k43.m7376J(r8)
            fc3 r1 = (p000.fc3) r1
            r7.f30642w = r4
            r7.f30641v = r3
            java.lang.Object r8 = p000.fi4.m5725i(r0, r1, r7)
            if (r8 != r5) goto L98
            r8 = r5
        L98:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1162sy.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
