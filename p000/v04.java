package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class v04 extends bp3 implements mq1 {

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ byte f32289u = 0;

    /* JADX INFO: renamed from: v */
    public long f32290v;

    /* JADX INFO: renamed from: w */
    public boolean f32291w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f32292x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f32293y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v04(long j, pl3 pl3Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f32290v = j;
        this.f32293y = pl3Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f32289u;
        Object obj2 = this.f32293y;
        switch (b) {
            case 0:
                v04 v04Var = new v04(this.f32290v, (pl3) obj2, wm0Var);
                v04Var.f32292x = obj;
                return v04Var;
            default:
                v04 v04Var2 = new v04((lc3) obj2, wm0Var);
                v04Var2.f32292x = obj;
                return v04Var2;
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f32289u;
        ju4 ju4Var = ju4.f22634a;
        uf4 uf4Var = (uf4) obj;
        wm0 wm0Var = (wm0) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((v04) create(wm0Var, uf4Var)).invokeSuspend(ju4Var);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    /* JADX WARN: Code duplicated, block: B:15:0x004f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0043 -> B:13:0x0047). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:12:0x0045
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC0888lx
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            byte r0 = r8.f32289u
            java.lang.Object r1 = r8.f32293y
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r4 = 1
            switch(r0) {
                case 0: goto L51;
                default: goto Lb;
            }
        Lb:
            ap0 r0 = p000.ap0.f14763a
            boolean r5 = r8.f32291w
            if (r5 == 0) goto L21
            if (r5 != r4) goto L1d
            long r1 = r8.f32290v
            java.lang.Object r3 = r8.f32292x
            uf4 r3 = (p000.uf4) r3
            p000.k43.m7376J(r9)
            goto L47
        L1d:
            p000.C1077qn.m9989o(r3)
            goto L50
        L21:
            p000.k43.m7376J(r9)
            java.lang.Object r9 = r8.f32292x
            uf4 r9 = (p000.uf4) r9
            lc3 r1 = (p000.lc3) r1
            long r1 = r1.f23936b
            fy4 r3 = r9.m11540k()
            r3.getClass()
            r5 = 40
            long r5 = r5 + r1
            r3 = r9
            r1 = r5
        L38:
            r8.f32292x = r3
            r8.f32290v = r1
            r8.f32291w = r4
            r9 = 3
            java.lang.Object r9 = p000.fi4.m5718b(r3, r8, r9)
            if (r9 != r0) goto L47
            r2 = r0
            goto L50
        L47:
            lc3 r9 = (p000.lc3) r9
            long r5 = r9.f23936b
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 < 0) goto L38
            r2 = r9
        L50:
            return r2
        L51:
            pl3 r1 = (p000.pl3) r1
            ap0 r0 = p000.ap0.f14763a
            boolean r5 = r8.f32291w
            if (r5 == 0) goto L67
            if (r5 != r4) goto L63
            java.lang.Object r8 = r8.f32292x
            uf4 r8 = (p000.uf4) r8
            p000.k43.m7376J(r9)
            goto L8a
        L63:
            p000.C1077qn.m9989o(r3)
            goto Lbc
        L67:
            p000.k43.m7376J(r9)
            java.lang.Object r9 = r8.f32292x
            uf4 r9 = (p000.uf4) r9
            long r2 = r8.f32290v
            u04 r5 = new u04
            r6 = 0
            r5.<init>(r6)
            r5.f31581b = r1
            java.lang.invoke.VarHandle.storeStoreFence()
            r8.f32292x = r9
            r8.f32291w = r4
            java.lang.Object r8 = p000.q21.m9708c(r9, r2, r5, r8)
            if (r8 != r0) goto L87
            r2 = r0
            goto Lbc
        L87:
            r7 = r9
            r9 = r8
            r8 = r7
        L8a:
            lc3 r9 = (p000.lc3) r9
            if (r9 == 0) goto La2
            long r0 = r1.f27736a
            r2 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r0 = r0 & r2
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 == 0) goto La2
            n11 r2 = p000.n11.f25378b
            goto Lbc
        La2:
            vf4 r8 = r8.f31830f
            ec3 r8 = r8.f32573s
            java.util.List r8 = r8.f18000a
            java.lang.Object r8 = p000.hb0.m6299K0(r8)
            lc3 r8 = (p000.lc3) r8
            boolean r9 = p000.AbstractC1356y5.m12923q(r8)
            if (r9 == 0) goto Lba
            r8.m7952a()
            n11 r2 = p000.n11.f25377a
            goto Lbc
        Lba:
            n11 r2 = p000.n11.f25380d
        Lbc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.v04.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v04(lc3 lc3Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f32293y = lc3Var;
    }
}
