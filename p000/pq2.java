package p000;

import java.lang.invoke.VarHandle;
import org.chromium.net.NetError;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class pq2 {

    /* JADX INFO: renamed from: a */
    public static final nc4 f27893a = new nc4(new da2(12));

    /* JADX INFO: renamed from: b */
    public static final nc4 f27894b = new nc4(new da2(13));

    /* JADX INFO: renamed from: a */
    public static final void m9598a(dc0 dc0Var, lu2 lu2Var, s44 s44Var, js4 js4Var, mq1 mq1Var, mi0 mi0Var, int i) {
        int i2;
        mq1 mq1Var2;
        dc0 dc0Var2;
        lu2 lu2Var2;
        js4 js4Var2;
        s44 s44Var2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(1317329884);
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6890g(dc0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6890g(lu2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ir1Var.m6890g(s44Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ir1Var.m6890g(js4Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ir1Var.m6894i(mq1Var) ? 16384 : 8192;
        }
        byte b = 0;
        byte b2 = 1;
        if (ir1Var.m6871T(i2 & 1, (i2 & 9363) != 9362)) {
            nc4 nc4Var = f27893a;
            if (((Boolean) ir1Var.m6898k(nc4Var)).booleanValue()) {
                ir1Var.m6885d0(1458663246);
                nc4 nc4Var2 = f27894b;
                if (dc0Var == null) {
                    ir1Var.m6885d0(-1061323065);
                    dc0Var2 = ((lq2) ir1Var.m6898k(nc4Var2)).f24277a;
                    ir1Var.m6912r(false);
                } else {
                    ir1Var.m6885d0(-1061323964);
                    ir1Var.m6912r(false);
                    dc0Var2 = dc0Var;
                }
                if (lu2Var == null) {
                    ir1Var.m6885d0(-1061320824);
                    lu2Var2 = ((lq2) ir1Var.m6898k(nc4Var2)).f24280d;
                    ir1Var.m6912r(false);
                } else {
                    ir1Var.m6885d0(-1061321754);
                    ir1Var.m6912r(false);
                    lu2Var2 = lu2Var;
                }
                if (js4Var == null) {
                    ir1Var.m6885d0(-1061318682);
                    js4Var2 = ((lq2) ir1Var.m6898k(nc4Var2)).f24278b;
                    ir1Var.m6912r(false);
                } else {
                    ir1Var.m6885d0(-1061319550);
                    ir1Var.m6912r(false);
                    js4Var2 = js4Var;
                }
                if (s44Var == null) {
                    ir1Var.m6885d0(-1061316862);
                    s44Var2 = ((lq2) ir1Var.m6898k(nc4Var2)).f24279c;
                    ir1Var.m6912r(false);
                } else {
                    ir1Var.m6885d0(-1061317606);
                    ir1Var.m6912r(false);
                    s44Var2 = s44Var;
                }
                mq1Var2 = mq1Var;
                m9599b(dc0Var2, lu2Var2, s44Var2, js4Var2, mq1Var2, ir1Var, i2 & 57344);
                ir1Var.m6912r(false);
            } else {
                mq1Var2 = mq1Var;
                ir1Var.m6885d0(1458990389);
                zh3 zh3VarMo7523a = nc4Var.mo7523a(Boolean.TRUE);
                r41 r41Var = new r41(b2);
                r41Var.f28992b = dc0Var;
                r41Var.f28993c = lu2Var;
                r41Var.f28994d = s44Var;
                r41Var.f28995e = js4Var;
                r41Var.f28996f = mq1Var2;
                VarHandle.storeStoreFence();
                as4.m3244c(zh3VarMo7523a, vd6.m11834R(1535649272, r41Var, ir1Var), ir1Var, 56);
                ir1Var.m6912r(false);
            }
        } else {
            mq1Var2 = mq1Var;
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            nq2 nq2Var = new nq2(b);
            nq2Var.f26031b = dc0Var;
            nq2Var.f26032c = lu2Var;
            nq2Var.f26033d = s44Var;
            nq2Var.f26034e = js4Var;
            nq2Var.f26035f = mq1Var2;
            nq2Var.f26036g = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = nq2Var;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9599b(dc0 dc0Var, lu2 lu2Var, s44 s44Var, js4 js4Var, mq1 mq1Var, mi0 mi0Var, int i) {
        int i2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(904511636);
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6890g(dc0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6890g(lu2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ir1Var.m6890g(s44Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ir1Var.m6890g(js4Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ir1Var.m6894i(mq1Var) ? 16384 : 8192;
        }
        byte b = 0;
        byte b2 = 1;
        if (ir1Var.m6871T(i2 & 1, (i2 & 9363) != 9362)) {
            ir1Var.m6876Y();
            if ((i & 1) != 0 && !ir1Var.m6856B()) {
                ir1Var.m6874W();
            }
            ir1Var.m6913s();
            lq2 lq2Var = new lq2(dc0Var, js4Var, s44Var, lu2Var);
            jq3 jq3VarM12729a = xp3.m12729a(null, 255);
            long j = dc0Var.f16940a;
            boolean zM6888f = ir1Var.m6888f(j);
            Object objM6869O = ir1Var.m6869O();
            if (zM6888f || objM6869O == ki0.f23136a) {
                rl4 rl4Var = new rl4(j, pb0.m9464c(j, 0.4f, 0.0f, 0.0f, 0.0f, 14));
                ir1Var.m6905n0(rl4Var);
                objM6869O = rl4Var;
            }
            zh3[] zh3VarArr = {f27894b.mo7523a(lq2Var), n22.f25413a.mo7523a(jq3VarM12729a), sl4.f30376a.mo7523a((rl4) objM6869O)};
            oq2 oq2Var = new oq2(b);
            oq2Var.f26961b = js4Var;
            oq2Var.f26962c = mq1Var;
            VarHandle.storeStoreFence();
            as4.m3245d(zh3VarArr, vd6.m11834R(-1750539308, oq2Var, ir1Var), ir1Var, 48);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            nq2 nq2Var = new nq2(b2);
            nq2Var.f26031b = dc0Var;
            nq2Var.f26032c = lu2Var;
            nq2Var.f26033d = s44Var;
            nq2Var.f26034e = js4Var;
            nq2Var.f26035f = mq1Var;
            nq2Var.f26036g = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = nq2Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static final void m9600c(dc0 dc0Var, s44 s44Var, js4 js4Var, mq1 mq1Var, mi0 mi0Var, int i, int i2) {
        dc0 dc0Var2;
        mq1 mq1Var2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-449719819);
        int i3 = (ir1Var.m6890g(dc0Var) ? 4 : 2) | i | (((i2 & 2) == 0 && ir1Var.m6890g(s44Var)) ? 32 : 16) | (((i2 & 4) == 0 && ir1Var.m6890g(js4Var)) ? 256 : 128);
        if ((i & 3072) == 0) {
            i3 |= ir1Var.m6894i(mq1Var) ? 2048 : 1024;
        }
        if (ir1Var.m6871T(i3 & 1, (i3 & 1171) != 1170)) {
            ir1Var.m6876Y();
            int i4 = i & 1;
            nc4 nc4Var = f27894b;
            if (i4 == 0 || ir1Var.m6856B()) {
                if ((i2 & 2) != 0) {
                    s44Var = ((lq2) ir1Var.m6898k(nc4Var)).f24279c;
                    i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                }
                if ((i2 & 4) != 0) {
                    js4Var = ((lq2) ir1Var.m6898k(nc4Var)).f24278b;
                    i3 &= -897;
                }
            } else {
                ir1Var.m6874W();
                if ((i2 & 2) != 0) {
                    i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
            }
            s44 s44Var2 = s44Var;
            js4 js4Var2 = js4Var;
            ir1Var.m6913s();
            int i5 = i3 << 3;
            dc0Var2 = dc0Var;
            mq1Var2 = mq1Var;
            m9599b(dc0Var2, ((lq2) ir1Var.m6898k(nc4Var)).f24280d, s44Var2, js4Var2, mq1Var2, ir1Var, (i3 & 14) | (i5 & 896) | (i5 & 7168) | (i5 & 57344));
            s44Var = s44Var2;
            js4Var = js4Var2;
        } else {
            dc0Var2 = dc0Var;
            mq1Var2 = mq1Var;
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            mq2 mq2Var = new mq2();
            mq2Var.f25132a = dc0Var2;
            mq2Var.f25133b = s44Var;
            mq2Var.f25134c = js4Var;
            mq2Var.f25135d = mq1Var2;
            mq2Var.f25136e = i;
            mq2Var.f25137f = i2;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = mq2Var;
        }
    }
}
