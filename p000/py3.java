package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class py3 {

    /* JADX INFO: renamed from: a */
    public si2 f28096a;

    /* JADX INFO: renamed from: b */
    public zo0 f28097b;

    /* JADX INFO: renamed from: c */
    public dn3 f28098c;

    /* JADX INFO: renamed from: d */
    public t82 f28099d;

    /* JADX INFO: renamed from: e */
    public f40 f28100e;

    /* JADX WARN: Code duplicated, block: B:22:0x0063  */
    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    /* JADX WARN: Code duplicated, block: B:30:0x009d  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:35:0x00af  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00db  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public final java.lang.Object m9685a(p000.ym0 r19) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.py3.m9685a(ym0):java.lang.Object");
    }

    /* JADX INFO: renamed from: b */
    public final boolean m9686b(ky3 ky3Var, float f, wp1 wp1Var, yp1 yp1Var) {
        boolean zMo6018a;
        si2 si2Var = this.f28096a;
        int iOrdinal = ky3Var.ordinal();
        byte b = 0;
        if (iOrdinal == 0) {
            zMo6018a = si2Var.mo6018a();
        } else {
            if (iOrdinal != 1) {
                C0670g.m5864c();
                return false;
            }
            zMo6018a = si2Var.mo6020c();
        }
        if (!zMo6018a) {
            return false;
        }
        if (this.f28099d == null) {
            this.f28099d = lb5.m7910S(this.f28097b, null, null, new ny3(this, null, b), 3);
        }
        this.f28100e.mo5493n(new ly3(ky3Var, f, wp1Var, yp1Var));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (p000.y70.m13033m(r7, r0) == r1) goto L23;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m9687c(ym0 ym0Var) {
        oy3 oy3Var;
        if (ym0Var instanceof oy3) {
            oy3Var = (oy3) ym0Var;
            int i = oy3Var.f27237w;
            if ((i & Integer.MIN_VALUE) != 0) {
                oy3Var.f27237w = i - Integer.MIN_VALUE;
            } else {
                oy3Var = new oy3(this, ym0Var);
            }
        } else {
            oy3Var = new oy3(this, ym0Var);
        }
        Object obj = oy3Var.f27235u;
        ap0 ap0Var = ap0.f14763a;
        int i2 = oy3Var.f27237w;
        if (i2 == 0) {
            k43.m7376J(obj);
            f40 f40Var = this.f28100e;
            ly3 ly3Var = ly3.f24466e;
            oy3Var.f27234t = this;
            oy3Var.f27237w = 1;
            if (f40Var.mo5484c(oy3Var, ly3Var) != ap0Var) {
            }
            return ap0Var;
        }
        if (i2 == 1) {
            this = oy3Var.f27234t;
            k43.m7376J(obj);
        } else {
            if (i2 != 2) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = oy3Var.f27234t;
            k43.m7376J(obj);
        }
        this.f28099d = null;
        return ju4.f22634a;
        t82 t82Var = this.f28099d;
        if (t82Var != null) {
            oy3Var.f27234t = this;
            oy3Var.f27237w = 2;
        }
        this.f28099d = null;
        return ju4.f22634a;
    }
}
