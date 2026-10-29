package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class ra1 {

    /* JADX INFO: renamed from: a */
    public static final kj0 f29113a = as4.m3262u(new fj0((byte) 8));

    /* JADX INFO: renamed from: b */
    public static final nc4 f29114b = new nc4(new fj0((byte) 9));

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0031  */
    /* JADX WARN: Code duplicated, block: B:17:0x0036  */
    /* JADX WARN: Code duplicated, block: B:19:0x003a  */
    /* JADX WARN: Code duplicated, block: B:21:0x0042  */
    /* JADX WARN: Code duplicated, block: B:22:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:56:0x009c  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00fd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:72:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:75:0x011a  */
    /* JADX WARN: Code duplicated, block: B:78:0x0149 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:79:0x014b  */
    /* JADX WARN: Code duplicated, block: B:84:0x0190 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x0192  */
    /* JADX WARN: Code duplicated, block: B:88:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:95:0x0240  */
    /* JADX WARN: Code duplicated, block: B:98:0x0251  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m10252a(nt2 nt2Var, mq1 mq1Var, mq1 mq1Var2, int i, a05 a05Var, a91 a91Var, pg0 pg0Var, mi0 mi0Var, int i2, int i3) {
        mq1 mq1Var3;
        int i4;
        mq1 mq1Var4;
        int i5;
        int i6;
        boolean z;
        nt2 nt2Var2;
        byte b;
        a05 a05Var2;
        a91 a91Var2;
        yk3 yk3VarM6916v;
        int i7;
        kt2 kt2Var;
        i50 i50Var;
        boolean zM6884d;
        Object objM6869O;
        ho4 ho4Var;
        Object objM6869O2;
        wp1 wp1Var;
        ag1 ag1VarM7919a0;
        gv0 gv0VarM12642a;
        boolean zM6890g;
        Object obj;
        a91 a91Var3;
        mq1 mq1Var5;
        a91 a91Var4;
        int i8;
        mq1 mq1Var6;
        a05 a05Var3;
        nt2 nt2Var3;
        e73 e73Var;
        boolean zM6890g2;
        Object obj2;
        nt2 nt2VarMo7630d;
        mq1 mq1Var7;
        int i9;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(1838189401);
        int i10 = i2 | 6;
        int i11 = i3 & 2;
        if (i11 == 0) {
            if ((i2 & 48) == 0) {
                mq1Var3 = mq1Var;
                i10 |= ir1Var.m6894i(mq1Var3) ? 32 : 16;
            }
            i4 = i3 & 4;
            if (i4 != 0) {
                if ((i2 & 384) == 0) {
                    mq1Var4 = mq1Var2;
                    if (ir1Var.m6894i(mq1Var4)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i10 |= i5;
                }
                if ((i3 & 8) != 0) {
                    i10 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    if (ir1Var.m6894i(null)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i10 |= i6;
                }
                if ((i2 & 24576) == 0) {
                    i10 |= 8192;
                }
                if ((196608 & i2) == 0) {
                    i10 |= 65536;
                }
                if ((1572864 & i2) == 0) {
                    i10 |= 524288;
                }
                if ((12582912 & i2) == 0) {
                    if (ir1Var.m6894i(pg0Var)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i10 |= i9;
                }
                if ((4793491 & i10) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (ir1Var.m6871T(i10 & 1, z)) {
                    ir1Var.m6876Y();
                    i7 = i2 & 1;
                    kt2Var = kt2.f23428a;
                    i50Var = ki0.f23136a;
                    if (i7 != 0 || ir1Var.m6856B()) {
                        if (i11 != 0) {
                            mq1Var3 = null;
                        }
                        if (i4 != 0) {
                            mq1Var4 = null;
                        }
                        gu4 gu4VarM12932z = AbstractC1356y5.m12932z(ir1Var);
                        if (mq1Var3 == null) {
                            ir1Var.m6885d0(667826052);
                            ir1Var.m6912r(false);
                            a91Var3 = null;
                        } else {
                            ir1Var.m6885d0(1268469748);
                            float f = eo4.f18335a;
                            float f2 = AbstractC0913ml.f24992a;
                            Object[] objArr = new Object[0];
                            yg3 yg3Var = ho4.f20755e;
                            zM6884d = ir1Var.m6884d(0.0f) | ir1Var.m6884d(-3.4028235E38f) | ir1Var.m6884d(0.0f);
                            objM6869O = ir1Var.m6869O();
                            if (zM6884d || objM6869O == i50Var) {
                                objM6869O = new C0515c5((byte) 13);
                                VarHandle.storeStoreFence();
                                ir1Var.m6905n0(objM6869O);
                            }
                            ho4Var = (ho4) dt0.m4688Q(objArr, yg3Var, (wp1) objM6869O, ir1Var, 0);
                            objM6869O2 = ir1Var.m6869O();
                            if (objM6869O2 == i50Var) {
                                objM6869O2 = new fj0((byte) 6);
                                ir1Var.m6905n0(objM6869O2);
                            }
                            wp1Var = (wp1) objM6869O2;
                            ag1VarM7919a0 = lb5.m7919a0(3, ir1Var);
                            gv0VarM12642a = xa4.m12642a(ir1Var);
                            zM6890g = ir1Var.m6890g(ho4Var) | ir1Var.m6890g(wp1Var) | ir1Var.m6890g(ag1VarM7919a0) | ir1Var.m6890g(gv0VarM12642a);
                            Object objM6869O3 = ir1Var.m6869O();
                            obj = objM6869O3;
                            if (zM6890g || objM6869O3 == i50Var) {
                                a91 a91Var5 = new a91();
                                a91Var5.f176a = ho4Var;
                                a91Var5.f177b = ag1VarM7919a0;
                                a91Var5.f178c = gv0VarM12642a;
                                a91Var5.f179d = wp1Var;
                                z81 z81Var = new z81();
                                z81Var.f35866a = a91Var5;
                                VarHandle.storeStoreFence();
                                a91Var5.f180e = z81Var;
                                VarHandle.storeStoreFence();
                                ir1Var.m6905n0(a91Var5);
                                obj = a91Var5;
                            }
                            a91Var3 = (a91) obj;
                            ir1Var.m6912r(false);
                        }
                        mq1Var5 = mq1Var4;
                        a91Var4 = a91Var3;
                        i8 = 2;
                        mq1Var6 = mq1Var3;
                        a05Var3 = gu4VarM12932z;
                        nt2Var3 = kt2Var;
                    } else {
                        ir1Var.m6874W();
                        nt2Var3 = nt2Var;
                        a91Var4 = a91Var;
                        mq1Var6 = mq1Var3;
                        mq1Var5 = mq1Var4;
                        i8 = i;
                        a05Var3 = a05Var;
                    }
                    ir1Var.m6913s();
                    e73Var = (e73) ir1Var.m6898k(f29113a);
                    zM6890g2 = ir1Var.m6890g(a05Var3) | ir1Var.m6890g(e73Var);
                    Object objM6869O4 = ir1Var.m6869O();
                    obj2 = objM6869O4;
                    if (zM6890g2 || objM6869O4 == i50Var) {
                        df2 df2Var = df2.f17011a;
                        nh1 nh1VarM5334I = ev0.m5334I(e73Var.mo3502a(df2Var), e73Var.mo3505d(), e73Var.mo3503b(df2Var), e73Var.mo3504c());
                        ob1 ob1Var = new ob1();
                        ob1Var.f26536a = a05Var3;
                        ob1Var.f26537b = nh1VarM5334I;
                        VarHandle.storeStoreFence();
                        ir1Var.m6905n0(ob1Var);
                        obj2 = ob1Var;
                    }
                    a05 a05Var4 = (a05) obj2;
                    if (a91Var4 != null) {
                        nt2VarMo7630d = nt2Var3.mo7630d(d24.m4289D(kt2Var, a91Var4.f180e, null));
                    } else {
                        nt2VarMo7630d = nt2Var3;
                    }
                    ne0 ne0Var = new ne0((byte) 26);
                    ne0Var.f25728b = a91Var4;
                    ne0Var.f25729c = mq1Var6;
                    VarHandle.storeStoreFence();
                    pg0 pg0VarM11834R = vd6.m11834R(1738185501, ne0Var, ir1Var);
                    if (mq1Var5 == null) {
                        mq1Var7 = C0006a5.f103c;
                    } else {
                        mq1Var7 = mq1Var5;
                    }
                    nt2 nt2Var4 = nt2Var3;
                    en0 en0Var = new en0((byte) 16);
                    VarHandle.storeStoreFence();
                    pg0 pg0VarM11834R2 = vd6.m11834R(1098057056, en0Var, ir1Var);
                    nh2 nh2Var = new nh2((byte) 6);
                    nh2Var.f25807d = mq1Var6;
                    nh2Var.f25805b = e73Var;
                    nh2Var.f25808e = mq1Var5;
                    nh2Var.f25806c = pg0Var;
                    VarHandle.storeStoreFence();
                    mq1 mq1Var8 = mq1Var6;
                    mq1 mq1Var9 = mq1Var5;
                    AbstractC1356y5.m12910d(nt2VarMo7630d, pg0VarM11834R, mq1Var7, null, pg0VarM11834R2, i8, 0L, 0L, a05Var4, vd6.m11834R(2077483048, nh2Var, ir1Var), ir1Var, 805330992, 200);
                    b = i8;
                    nt2Var2 = nt2Var4;
                    a91Var2 = a91Var4;
                    a05Var2 = a05Var3;
                    mq1Var3 = mq1Var8;
                    mq1Var4 = mq1Var9;
                } else {
                    ir1Var.m6874W();
                    nt2Var2 = nt2Var;
                    b = i;
                    a05Var2 = a05Var;
                    a91Var2 = a91Var;
                }
                yk3VarM6916v = ir1Var.m6916v();
                if (yk3VarM6916v != null) {
                    qa1 qa1Var = new qa1();
                    qa1Var.f28331a = nt2Var2;
                    qa1Var.f28332b = mq1Var3;
                    qa1Var.f28333c = mq1Var4;
                    qa1Var.f28334d = b;
                    qa1Var.f28335e = a05Var2;
                    qa1Var.f28336f = a91Var2;
                    qa1Var.f28337g = pg0Var;
                    qa1Var.f28338h = i2;
                    qa1Var.f28339i = i3;
                    VarHandle.storeStoreFence();
                    yk3VarM6916v.f35300d = qa1Var;
                }
            }
            i10 |= 384;
            mq1Var4 = mq1Var2;
            if ((i3 & 8) != 0) {
                i10 |= 3072;
            } else if ((i2 & 3072) == 0) {
                if (ir1Var.m6894i(null)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i10 |= i6;
            }
            if ((i2 & 24576) == 0) {
                i10 |= 8192;
            }
            if ((196608 & i2) == 0) {
                i10 |= 65536;
            }
            if ((1572864 & i2) == 0) {
                i10 |= 524288;
            }
            if ((12582912 & i2) == 0) {
                if (ir1Var.m6894i(pg0Var)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i10 |= i9;
            }
            if ((4793491 & i10) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (ir1Var.m6871T(i10 & 1, z)) {
                ir1Var.m6876Y();
                i7 = i2 & 1;
                kt2Var = kt2.f23428a;
                i50Var = ki0.f23136a;
                if (i7 != 0) {
                    if (i11 != 0) {
                        mq1Var3 = null;
                    }
                    if (i4 != 0) {
                        mq1Var4 = null;
                    }
                    gu4 gu4VarM12932z2 = AbstractC1356y5.m12932z(ir1Var);
                    if (mq1Var3 == null) {
                        ir1Var.m6885d0(667826052);
                        ir1Var.m6912r(false);
                        a91Var3 = null;
                    } else {
                        ir1Var.m6885d0(1268469748);
                        float f3 = eo4.f18335a;
                        float f4 = AbstractC0913ml.f24992a;
                        Object[] objArr2 = new Object[0];
                        yg3 yg3Var2 = ho4.f20755e;
                        zM6884d = ir1Var.m6884d(0.0f) | ir1Var.m6884d(-3.4028235E38f) | ir1Var.m6884d(0.0f);
                        objM6869O = ir1Var.m6869O();
                        if (zM6884d) {
                            objM6869O = new C0515c5((byte) 13);
                            VarHandle.storeStoreFence();
                            ir1Var.m6905n0(objM6869O);
                        } else {
                            objM6869O = new C0515c5((byte) 13);
                            VarHandle.storeStoreFence();
                            ir1Var.m6905n0(objM6869O);
                        }
                        ho4Var = (ho4) dt0.m4688Q(objArr2, yg3Var2, (wp1) objM6869O, ir1Var, 0);
                        objM6869O2 = ir1Var.m6869O();
                        if (objM6869O2 == i50Var) {
                            objM6869O2 = new fj0((byte) 6);
                            ir1Var.m6905n0(objM6869O2);
                        }
                        wp1Var = (wp1) objM6869O2;
                        ag1VarM7919a0 = lb5.m7919a0(3, ir1Var);
                        gv0VarM12642a = xa4.m12642a(ir1Var);
                        zM6890g = ir1Var.m6890g(ho4Var) | ir1Var.m6890g(wp1Var) | ir1Var.m6890g(ag1VarM7919a0) | ir1Var.m6890g(gv0VarM12642a);
                        Object objM6869O5 = ir1Var.m6869O();
                        obj = objM6869O5;
                        if (zM6890g) {
                            a91 a91Var6 = new a91();
                            a91Var6.f176a = ho4Var;
                            a91Var6.f177b = ag1VarM7919a0;
                            a91Var6.f178c = gv0VarM12642a;
                            a91Var6.f179d = wp1Var;
                            z81 z81Var2 = new z81();
                            z81Var2.f35866a = a91Var6;
                            VarHandle.storeStoreFence();
                            a91Var6.f180e = z81Var2;
                            VarHandle.storeStoreFence();
                            ir1Var.m6905n0(a91Var6);
                            obj = a91Var6;
                        } else {
                            a91 a91Var7 = new a91();
                            a91Var7.f176a = ho4Var;
                            a91Var7.f177b = ag1VarM7919a0;
                            a91Var7.f178c = gv0VarM12642a;
                            a91Var7.f179d = wp1Var;
                            z81 z81Var3 = new z81();
                            z81Var3.f35866a = a91Var7;
                            VarHandle.storeStoreFence();
                            a91Var7.f180e = z81Var3;
                            VarHandle.storeStoreFence();
                            ir1Var.m6905n0(a91Var7);
                            obj = a91Var7;
                        }
                        a91Var3 = (a91) obj;
                        ir1Var.m6912r(false);
                    }
                    mq1Var5 = mq1Var4;
                    a91Var4 = a91Var3;
                    i8 = 2;
                    mq1Var6 = mq1Var3;
                    a05Var3 = gu4VarM12932z2;
                    nt2Var3 = kt2Var;
                } else {
                    if (i11 != 0) {
                        mq1Var3 = null;
                    }
                    if (i4 != 0) {
                        mq1Var4 = null;
                    }
                    gu4 gu4VarM12932z3 = AbstractC1356y5.m12932z(ir1Var);
                    if (mq1Var3 == null) {
                        ir1Var.m6885d0(667826052);
                        ir1Var.m6912r(false);
                        a91Var3 = null;
                    } else {
                        ir1Var.m6885d0(1268469748);
                        float f5 = eo4.f18335a;
                        float f6 = AbstractC0913ml.f24992a;
                        Object[] objArr3 = new Object[0];
                        yg3 yg3Var3 = ho4.f20755e;
                        zM6884d = ir1Var.m6884d(0.0f) | ir1Var.m6884d(-3.4028235E38f) | ir1Var.m6884d(0.0f);
                        objM6869O = ir1Var.m6869O();
                        if (zM6884d) {
                            objM6869O = new C0515c5((byte) 13);
                            VarHandle.storeStoreFence();
                            ir1Var.m6905n0(objM6869O);
                        } else {
                            objM6869O = new C0515c5((byte) 13);
                            VarHandle.storeStoreFence();
                            ir1Var.m6905n0(objM6869O);
                        }
                        ho4Var = (ho4) dt0.m4688Q(objArr3, yg3Var3, (wp1) objM6869O, ir1Var, 0);
                        objM6869O2 = ir1Var.m6869O();
                        if (objM6869O2 == i50Var) {
                            objM6869O2 = new fj0((byte) 6);
                            ir1Var.m6905n0(objM6869O2);
                        }
                        wp1Var = (wp1) objM6869O2;
                        ag1VarM7919a0 = lb5.m7919a0(3, ir1Var);
                        gv0VarM12642a = xa4.m12642a(ir1Var);
                        zM6890g = ir1Var.m6890g(ho4Var) | ir1Var.m6890g(wp1Var) | ir1Var.m6890g(ag1VarM7919a0) | ir1Var.m6890g(gv0VarM12642a);
                        Object objM6869O6 = ir1Var.m6869O();
                        obj = objM6869O6;
                        if (zM6890g) {
                            a91 a91Var8 = new a91();
                            a91Var8.f176a = ho4Var;
                            a91Var8.f177b = ag1VarM7919a0;
                            a91Var8.f178c = gv0VarM12642a;
                            a91Var8.f179d = wp1Var;
                            z81 z81Var4 = new z81();
                            z81Var4.f35866a = a91Var8;
                            VarHandle.storeStoreFence();
                            a91Var8.f180e = z81Var4;
                            VarHandle.storeStoreFence();
                            ir1Var.m6905n0(a91Var8);
                            obj = a91Var8;
                        } else {
                            a91 a91Var9 = new a91();
                            a91Var9.f176a = ho4Var;
                            a91Var9.f177b = ag1VarM7919a0;
                            a91Var9.f178c = gv0VarM12642a;
                            a91Var9.f179d = wp1Var;
                            z81 z81Var5 = new z81();
                            z81Var5.f35866a = a91Var9;
                            VarHandle.storeStoreFence();
                            a91Var9.f180e = z81Var5;
                            VarHandle.storeStoreFence();
                            ir1Var.m6905n0(a91Var9);
                            obj = a91Var9;
                        }
                        a91Var3 = (a91) obj;
                        ir1Var.m6912r(false);
                    }
                    mq1Var5 = mq1Var4;
                    a91Var4 = a91Var3;
                    i8 = 2;
                    mq1Var6 = mq1Var3;
                    a05Var3 = gu4VarM12932z3;
                    nt2Var3 = kt2Var;
                }
                ir1Var.m6913s();
                e73Var = (e73) ir1Var.m6898k(f29113a);
                zM6890g2 = ir1Var.m6890g(a05Var3) | ir1Var.m6890g(e73Var);
                Object objM6869O7 = ir1Var.m6869O();
                obj2 = objM6869O7;
                if (zM6890g2) {
                    df2 df2Var2 = df2.f17011a;
                    nh1 nh1VarM5334I2 = ev0.m5334I(e73Var.mo3502a(df2Var2), e73Var.mo3505d(), e73Var.mo3503b(df2Var2), e73Var.mo3504c());
                    ob1 ob1Var2 = new ob1();
                    ob1Var2.f26536a = a05Var3;
                    ob1Var2.f26537b = nh1VarM5334I2;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(ob1Var2);
                    obj2 = ob1Var2;
                } else {
                    df2 df2Var3 = df2.f17011a;
                    nh1 nh1VarM5334I3 = ev0.m5334I(e73Var.mo3502a(df2Var3), e73Var.mo3505d(), e73Var.mo3503b(df2Var3), e73Var.mo3504c());
                    ob1 ob1Var3 = new ob1();
                    ob1Var3.f26536a = a05Var3;
                    ob1Var3.f26537b = nh1VarM5334I3;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(ob1Var3);
                    obj2 = ob1Var3;
                }
                a05 a05Var5 = (a05) obj2;
                if (a91Var4 != null) {
                    nt2VarMo7630d = nt2Var3.mo7630d(d24.m4289D(kt2Var, a91Var4.f180e, null));
                } else {
                    nt2VarMo7630d = nt2Var3;
                }
                ne0 ne0Var2 = new ne0((byte) 26);
                ne0Var2.f25728b = a91Var4;
                ne0Var2.f25729c = mq1Var6;
                VarHandle.storeStoreFence();
                pg0 pg0VarM11834R3 = vd6.m11834R(1738185501, ne0Var2, ir1Var);
                if (mq1Var5 == null) {
                    mq1Var7 = C0006a5.f103c;
                } else {
                    mq1Var7 = mq1Var5;
                }
                nt2 nt2Var5 = nt2Var3;
                en0 en0Var2 = new en0((byte) 16);
                VarHandle.storeStoreFence();
                pg0 pg0VarM11834R4 = vd6.m11834R(1098057056, en0Var2, ir1Var);
                nh2 nh2Var2 = new nh2((byte) 6);
                nh2Var2.f25807d = mq1Var6;
                nh2Var2.f25805b = e73Var;
                nh2Var2.f25808e = mq1Var5;
                nh2Var2.f25806c = pg0Var;
                VarHandle.storeStoreFence();
                mq1 mq1Var10 = mq1Var6;
                mq1 mq1Var11 = mq1Var5;
                AbstractC1356y5.m12910d(nt2VarMo7630d, pg0VarM11834R3, mq1Var7, null, pg0VarM11834R4, i8, 0L, 0L, a05Var5, vd6.m11834R(2077483048, nh2Var2, ir1Var), ir1Var, 805330992, 200);
                b = i8;
                nt2Var2 = nt2Var5;
                a91Var2 = a91Var4;
                a05Var2 = a05Var3;
                mq1Var3 = mq1Var10;
                mq1Var4 = mq1Var11;
            } else {
                ir1Var.m6874W();
                nt2Var2 = nt2Var;
                b = i;
                a05Var2 = a05Var;
                a91Var2 = a91Var;
            }
            yk3VarM6916v = ir1Var.m6916v();
            if (yk3VarM6916v != null) {
                qa1 qa1Var2 = new qa1();
                qa1Var2.f28331a = nt2Var2;
                qa1Var2.f28332b = mq1Var3;
                qa1Var2.f28333c = mq1Var4;
                qa1Var2.f28334d = b;
                qa1Var2.f28335e = a05Var2;
                qa1Var2.f28336f = a91Var2;
                qa1Var2.f28337g = pg0Var;
                qa1Var2.f28338h = i2;
                qa1Var2.f28339i = i3;
                VarHandle.storeStoreFence();
                yk3VarM6916v.f35300d = qa1Var2;
            }
        }
        i10 = i2 | 54;
        mq1Var3 = mq1Var;
        i4 = i3 & 4;
        if (i4 != 0) {
            if ((i2 & 384) == 0) {
                mq1Var4 = mq1Var2;
                if (ir1Var.m6894i(mq1Var4)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i10 |= i5;
            }
            if ((i3 & 8) != 0) {
                i10 |= 3072;
            } else if ((i2 & 3072) == 0) {
                if (ir1Var.m6894i(null)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i10 |= i6;
            }
            if ((i2 & 24576) == 0) {
                i10 |= 8192;
            }
            if ((196608 & i2) == 0) {
                i10 |= 65536;
            }
            if ((1572864 & i2) == 0) {
                i10 |= 524288;
            }
            if ((12582912 & i2) == 0) {
                if (ir1Var.m6894i(pg0Var)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i10 |= i9;
            }
            if ((4793491 & i10) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (ir1Var.m6871T(i10 & 1, z)) {
                ir1Var.m6876Y();
                i7 = i2 & 1;
                kt2Var = kt2.f23428a;
                i50Var = ki0.f23136a;
                if (i7 != 0) {
                    if (i11 != 0) {
                        mq1Var3 = null;
                    }
                    if (i4 != 0) {
                        mq1Var4 = null;
                    }
                    gu4 gu4VarM12932z4 = AbstractC1356y5.m12932z(ir1Var);
                    if (mq1Var3 == null) {
                        ir1Var.m6885d0(667826052);
                        ir1Var.m6912r(false);
                        a91Var3 = null;
                    } else {
                        ir1Var.m6885d0(1268469748);
                        float f7 = eo4.f18335a;
                        float f8 = AbstractC0913ml.f24992a;
                        Object[] objArr4 = new Object[0];
                        yg3 yg3Var4 = ho4.f20755e;
                        zM6884d = ir1Var.m6884d(0.0f) | ir1Var.m6884d(-3.4028235E38f) | ir1Var.m6884d(0.0f);
                        objM6869O = ir1Var.m6869O();
                        if (zM6884d) {
                            objM6869O = new C0515c5((byte) 13);
                            VarHandle.storeStoreFence();
                            ir1Var.m6905n0(objM6869O);
                        } else {
                            objM6869O = new C0515c5((byte) 13);
                            VarHandle.storeStoreFence();
                            ir1Var.m6905n0(objM6869O);
                        }
                        ho4Var = (ho4) dt0.m4688Q(objArr4, yg3Var4, (wp1) objM6869O, ir1Var, 0);
                        objM6869O2 = ir1Var.m6869O();
                        if (objM6869O2 == i50Var) {
                            objM6869O2 = new fj0((byte) 6);
                            ir1Var.m6905n0(objM6869O2);
                        }
                        wp1Var = (wp1) objM6869O2;
                        ag1VarM7919a0 = lb5.m7919a0(3, ir1Var);
                        gv0VarM12642a = xa4.m12642a(ir1Var);
                        zM6890g = ir1Var.m6890g(ho4Var) | ir1Var.m6890g(wp1Var) | ir1Var.m6890g(ag1VarM7919a0) | ir1Var.m6890g(gv0VarM12642a);
                        Object objM6869O8 = ir1Var.m6869O();
                        obj = objM6869O8;
                        if (zM6890g) {
                            a91 a91Var10 = new a91();
                            a91Var10.f176a = ho4Var;
                            a91Var10.f177b = ag1VarM7919a0;
                            a91Var10.f178c = gv0VarM12642a;
                            a91Var10.f179d = wp1Var;
                            z81 z81Var6 = new z81();
                            z81Var6.f35866a = a91Var10;
                            VarHandle.storeStoreFence();
                            a91Var10.f180e = z81Var6;
                            VarHandle.storeStoreFence();
                            ir1Var.m6905n0(a91Var10);
                            obj = a91Var10;
                        } else {
                            a91 a91Var11 = new a91();
                            a91Var11.f176a = ho4Var;
                            a91Var11.f177b = ag1VarM7919a0;
                            a91Var11.f178c = gv0VarM12642a;
                            a91Var11.f179d = wp1Var;
                            z81 z81Var7 = new z81();
                            z81Var7.f35866a = a91Var11;
                            VarHandle.storeStoreFence();
                            a91Var11.f180e = z81Var7;
                            VarHandle.storeStoreFence();
                            ir1Var.m6905n0(a91Var11);
                            obj = a91Var11;
                        }
                        a91Var3 = (a91) obj;
                        ir1Var.m6912r(false);
                    }
                    mq1Var5 = mq1Var4;
                    a91Var4 = a91Var3;
                    i8 = 2;
                    mq1Var6 = mq1Var3;
                    a05Var3 = gu4VarM12932z4;
                    nt2Var3 = kt2Var;
                } else {
                    if (i11 != 0) {
                        mq1Var3 = null;
                    }
                    if (i4 != 0) {
                        mq1Var4 = null;
                    }
                    gu4 gu4VarM12932z5 = AbstractC1356y5.m12932z(ir1Var);
                    if (mq1Var3 == null) {
                        ir1Var.m6885d0(667826052);
                        ir1Var.m6912r(false);
                        a91Var3 = null;
                    } else {
                        ir1Var.m6885d0(1268469748);
                        float f9 = eo4.f18335a;
                        float f10 = AbstractC0913ml.f24992a;
                        Object[] objArr5 = new Object[0];
                        yg3 yg3Var5 = ho4.f20755e;
                        zM6884d = ir1Var.m6884d(0.0f) | ir1Var.m6884d(-3.4028235E38f) | ir1Var.m6884d(0.0f);
                        objM6869O = ir1Var.m6869O();
                        if (zM6884d) {
                            objM6869O = new C0515c5((byte) 13);
                            VarHandle.storeStoreFence();
                            ir1Var.m6905n0(objM6869O);
                        } else {
                            objM6869O = new C0515c5((byte) 13);
                            VarHandle.storeStoreFence();
                            ir1Var.m6905n0(objM6869O);
                        }
                        ho4Var = (ho4) dt0.m4688Q(objArr5, yg3Var5, (wp1) objM6869O, ir1Var, 0);
                        objM6869O2 = ir1Var.m6869O();
                        if (objM6869O2 == i50Var) {
                            objM6869O2 = new fj0((byte) 6);
                            ir1Var.m6905n0(objM6869O2);
                        }
                        wp1Var = (wp1) objM6869O2;
                        ag1VarM7919a0 = lb5.m7919a0(3, ir1Var);
                        gv0VarM12642a = xa4.m12642a(ir1Var);
                        zM6890g = ir1Var.m6890g(ho4Var) | ir1Var.m6890g(wp1Var) | ir1Var.m6890g(ag1VarM7919a0) | ir1Var.m6890g(gv0VarM12642a);
                        Object objM6869O9 = ir1Var.m6869O();
                        obj = objM6869O9;
                        if (zM6890g) {
                            a91 a91Var12 = new a91();
                            a91Var12.f176a = ho4Var;
                            a91Var12.f177b = ag1VarM7919a0;
                            a91Var12.f178c = gv0VarM12642a;
                            a91Var12.f179d = wp1Var;
                            z81 z81Var8 = new z81();
                            z81Var8.f35866a = a91Var12;
                            VarHandle.storeStoreFence();
                            a91Var12.f180e = z81Var8;
                            VarHandle.storeStoreFence();
                            ir1Var.m6905n0(a91Var12);
                            obj = a91Var12;
                        } else {
                            a91 a91Var13 = new a91();
                            a91Var13.f176a = ho4Var;
                            a91Var13.f177b = ag1VarM7919a0;
                            a91Var13.f178c = gv0VarM12642a;
                            a91Var13.f179d = wp1Var;
                            z81 z81Var9 = new z81();
                            z81Var9.f35866a = a91Var13;
                            VarHandle.storeStoreFence();
                            a91Var13.f180e = z81Var9;
                            VarHandle.storeStoreFence();
                            ir1Var.m6905n0(a91Var13);
                            obj = a91Var13;
                        }
                        a91Var3 = (a91) obj;
                        ir1Var.m6912r(false);
                    }
                    mq1Var5 = mq1Var4;
                    a91Var4 = a91Var3;
                    i8 = 2;
                    mq1Var6 = mq1Var3;
                    a05Var3 = gu4VarM12932z5;
                    nt2Var3 = kt2Var;
                }
                ir1Var.m6913s();
                e73Var = (e73) ir1Var.m6898k(f29113a);
                zM6890g2 = ir1Var.m6890g(a05Var3) | ir1Var.m6890g(e73Var);
                Object objM6869O10 = ir1Var.m6869O();
                obj2 = objM6869O10;
                if (zM6890g2) {
                    df2 df2Var4 = df2.f17011a;
                    nh1 nh1VarM5334I4 = ev0.m5334I(e73Var.mo3502a(df2Var4), e73Var.mo3505d(), e73Var.mo3503b(df2Var4), e73Var.mo3504c());
                    ob1 ob1Var4 = new ob1();
                    ob1Var4.f26536a = a05Var3;
                    ob1Var4.f26537b = nh1VarM5334I4;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(ob1Var4);
                    obj2 = ob1Var4;
                } else {
                    df2 df2Var5 = df2.f17011a;
                    nh1 nh1VarM5334I5 = ev0.m5334I(e73Var.mo3502a(df2Var5), e73Var.mo3505d(), e73Var.mo3503b(df2Var5), e73Var.mo3504c());
                    ob1 ob1Var5 = new ob1();
                    ob1Var5.f26536a = a05Var3;
                    ob1Var5.f26537b = nh1VarM5334I5;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(ob1Var5);
                    obj2 = ob1Var5;
                }
                a05 a05Var6 = (a05) obj2;
                if (a91Var4 != null) {
                    nt2VarMo7630d = nt2Var3.mo7630d(d24.m4289D(kt2Var, a91Var4.f180e, null));
                } else {
                    nt2VarMo7630d = nt2Var3;
                }
                ne0 ne0Var3 = new ne0((byte) 26);
                ne0Var3.f25728b = a91Var4;
                ne0Var3.f25729c = mq1Var6;
                VarHandle.storeStoreFence();
                pg0 pg0VarM11834R5 = vd6.m11834R(1738185501, ne0Var3, ir1Var);
                if (mq1Var5 == null) {
                    mq1Var7 = C0006a5.f103c;
                } else {
                    mq1Var7 = mq1Var5;
                }
                nt2 nt2Var6 = nt2Var3;
                en0 en0Var3 = new en0((byte) 16);
                VarHandle.storeStoreFence();
                pg0 pg0VarM11834R6 = vd6.m11834R(1098057056, en0Var3, ir1Var);
                nh2 nh2Var3 = new nh2((byte) 6);
                nh2Var3.f25807d = mq1Var6;
                nh2Var3.f25805b = e73Var;
                nh2Var3.f25808e = mq1Var5;
                nh2Var3.f25806c = pg0Var;
                VarHandle.storeStoreFence();
                mq1 mq1Var12 = mq1Var6;
                mq1 mq1Var13 = mq1Var5;
                AbstractC1356y5.m12910d(nt2VarMo7630d, pg0VarM11834R5, mq1Var7, null, pg0VarM11834R6, i8, 0L, 0L, a05Var6, vd6.m11834R(2077483048, nh2Var3, ir1Var), ir1Var, 805330992, 200);
                b = i8;
                nt2Var2 = nt2Var6;
                a91Var2 = a91Var4;
                a05Var2 = a05Var3;
                mq1Var3 = mq1Var12;
                mq1Var4 = mq1Var13;
            } else {
                ir1Var.m6874W();
                nt2Var2 = nt2Var;
                b = i;
                a05Var2 = a05Var;
                a91Var2 = a91Var;
            }
            yk3VarM6916v = ir1Var.m6916v();
            if (yk3VarM6916v != null) {
                qa1 qa1Var3 = new qa1();
                qa1Var3.f28331a = nt2Var2;
                qa1Var3.f28332b = mq1Var3;
                qa1Var3.f28333c = mq1Var4;
                qa1Var3.f28334d = b;
                qa1Var3.f28335e = a05Var2;
                qa1Var3.f28336f = a91Var2;
                qa1Var3.f28337g = pg0Var;
                qa1Var3.f28338h = i2;
                qa1Var3.f28339i = i3;
                VarHandle.storeStoreFence();
                yk3VarM6916v.f35300d = qa1Var3;
            }
        }
        i10 |= 384;
        mq1Var4 = mq1Var2;
        if ((i3 & 8) != 0) {
            i10 |= 3072;
        } else if ((i2 & 3072) == 0) {
            if (ir1Var.m6894i(null)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i10 |= i6;
        }
        if ((i2 & 24576) == 0) {
            i10 |= 8192;
        }
        if ((196608 & i2) == 0) {
            i10 |= 65536;
        }
        if ((1572864 & i2) == 0) {
            i10 |= 524288;
        }
        if ((12582912 & i2) == 0) {
            if (ir1Var.m6894i(pg0Var)) {
                i9 = 8388608;
            } else {
                i9 = 4194304;
            }
            i10 |= i9;
        }
        if ((4793491 & i10) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (ir1Var.m6871T(i10 & 1, z)) {
            ir1Var.m6876Y();
            i7 = i2 & 1;
            kt2Var = kt2.f23428a;
            i50Var = ki0.f23136a;
            if (i7 != 0) {
                if (i11 != 0) {
                    mq1Var3 = null;
                }
                if (i4 != 0) {
                    mq1Var4 = null;
                }
                gu4 gu4VarM12932z6 = AbstractC1356y5.m12932z(ir1Var);
                if (mq1Var3 == null) {
                    ir1Var.m6885d0(667826052);
                    ir1Var.m6912r(false);
                    a91Var3 = null;
                } else {
                    ir1Var.m6885d0(1268469748);
                    float f11 = eo4.f18335a;
                    float f12 = AbstractC0913ml.f24992a;
                    Object[] objArr6 = new Object[0];
                    yg3 yg3Var6 = ho4.f20755e;
                    zM6884d = ir1Var.m6884d(0.0f) | ir1Var.m6884d(-3.4028235E38f) | ir1Var.m6884d(0.0f);
                    objM6869O = ir1Var.m6869O();
                    if (zM6884d) {
                        objM6869O = new C0515c5((byte) 13);
                        VarHandle.storeStoreFence();
                        ir1Var.m6905n0(objM6869O);
                    } else {
                        objM6869O = new C0515c5((byte) 13);
                        VarHandle.storeStoreFence();
                        ir1Var.m6905n0(objM6869O);
                    }
                    ho4Var = (ho4) dt0.m4688Q(objArr6, yg3Var6, (wp1) objM6869O, ir1Var, 0);
                    objM6869O2 = ir1Var.m6869O();
                    if (objM6869O2 == i50Var) {
                        objM6869O2 = new fj0((byte) 6);
                        ir1Var.m6905n0(objM6869O2);
                    }
                    wp1Var = (wp1) objM6869O2;
                    ag1VarM7919a0 = lb5.m7919a0(3, ir1Var);
                    gv0VarM12642a = xa4.m12642a(ir1Var);
                    zM6890g = ir1Var.m6890g(ho4Var) | ir1Var.m6890g(wp1Var) | ir1Var.m6890g(ag1VarM7919a0) | ir1Var.m6890g(gv0VarM12642a);
                    Object objM6869O11 = ir1Var.m6869O();
                    obj = objM6869O11;
                    if (zM6890g) {
                        a91 a91Var14 = new a91();
                        a91Var14.f176a = ho4Var;
                        a91Var14.f177b = ag1VarM7919a0;
                        a91Var14.f178c = gv0VarM12642a;
                        a91Var14.f179d = wp1Var;
                        z81 z81Var10 = new z81();
                        z81Var10.f35866a = a91Var14;
                        VarHandle.storeStoreFence();
                        a91Var14.f180e = z81Var10;
                        VarHandle.storeStoreFence();
                        ir1Var.m6905n0(a91Var14);
                        obj = a91Var14;
                    } else {
                        a91 a91Var15 = new a91();
                        a91Var15.f176a = ho4Var;
                        a91Var15.f177b = ag1VarM7919a0;
                        a91Var15.f178c = gv0VarM12642a;
                        a91Var15.f179d = wp1Var;
                        z81 z81Var11 = new z81();
                        z81Var11.f35866a = a91Var15;
                        VarHandle.storeStoreFence();
                        a91Var15.f180e = z81Var11;
                        VarHandle.storeStoreFence();
                        ir1Var.m6905n0(a91Var15);
                        obj = a91Var15;
                    }
                    a91Var3 = (a91) obj;
                    ir1Var.m6912r(false);
                }
                mq1Var5 = mq1Var4;
                a91Var4 = a91Var3;
                i8 = 2;
                mq1Var6 = mq1Var3;
                a05Var3 = gu4VarM12932z6;
                nt2Var3 = kt2Var;
            } else {
                if (i11 != 0) {
                    mq1Var3 = null;
                }
                if (i4 != 0) {
                    mq1Var4 = null;
                }
                gu4 gu4VarM12932z7 = AbstractC1356y5.m12932z(ir1Var);
                if (mq1Var3 == null) {
                    ir1Var.m6885d0(667826052);
                    ir1Var.m6912r(false);
                    a91Var3 = null;
                } else {
                    ir1Var.m6885d0(1268469748);
                    float f13 = eo4.f18335a;
                    float f14 = AbstractC0913ml.f24992a;
                    Object[] objArr7 = new Object[0];
                    yg3 yg3Var7 = ho4.f20755e;
                    zM6884d = ir1Var.m6884d(0.0f) | ir1Var.m6884d(-3.4028235E38f) | ir1Var.m6884d(0.0f);
                    objM6869O = ir1Var.m6869O();
                    if (zM6884d) {
                        objM6869O = new C0515c5((byte) 13);
                        VarHandle.storeStoreFence();
                        ir1Var.m6905n0(objM6869O);
                    } else {
                        objM6869O = new C0515c5((byte) 13);
                        VarHandle.storeStoreFence();
                        ir1Var.m6905n0(objM6869O);
                    }
                    ho4Var = (ho4) dt0.m4688Q(objArr7, yg3Var7, (wp1) objM6869O, ir1Var, 0);
                    objM6869O2 = ir1Var.m6869O();
                    if (objM6869O2 == i50Var) {
                        objM6869O2 = new fj0((byte) 6);
                        ir1Var.m6905n0(objM6869O2);
                    }
                    wp1Var = (wp1) objM6869O2;
                    ag1VarM7919a0 = lb5.m7919a0(3, ir1Var);
                    gv0VarM12642a = xa4.m12642a(ir1Var);
                    zM6890g = ir1Var.m6890g(ho4Var) | ir1Var.m6890g(wp1Var) | ir1Var.m6890g(ag1VarM7919a0) | ir1Var.m6890g(gv0VarM12642a);
                    Object objM6869O12 = ir1Var.m6869O();
                    obj = objM6869O12;
                    if (zM6890g) {
                        a91 a91Var16 = new a91();
                        a91Var16.f176a = ho4Var;
                        a91Var16.f177b = ag1VarM7919a0;
                        a91Var16.f178c = gv0VarM12642a;
                        a91Var16.f179d = wp1Var;
                        z81 z81Var12 = new z81();
                        z81Var12.f35866a = a91Var16;
                        VarHandle.storeStoreFence();
                        a91Var16.f180e = z81Var12;
                        VarHandle.storeStoreFence();
                        ir1Var.m6905n0(a91Var16);
                        obj = a91Var16;
                    } else {
                        a91 a91Var17 = new a91();
                        a91Var17.f176a = ho4Var;
                        a91Var17.f177b = ag1VarM7919a0;
                        a91Var17.f178c = gv0VarM12642a;
                        a91Var17.f179d = wp1Var;
                        z81 z81Var13 = new z81();
                        z81Var13.f35866a = a91Var17;
                        VarHandle.storeStoreFence();
                        a91Var17.f180e = z81Var13;
                        VarHandle.storeStoreFence();
                        ir1Var.m6905n0(a91Var17);
                        obj = a91Var17;
                    }
                    a91Var3 = (a91) obj;
                    ir1Var.m6912r(false);
                }
                mq1Var5 = mq1Var4;
                a91Var4 = a91Var3;
                i8 = 2;
                mq1Var6 = mq1Var3;
                a05Var3 = gu4VarM12932z7;
                nt2Var3 = kt2Var;
            }
            ir1Var.m6913s();
            e73Var = (e73) ir1Var.m6898k(f29113a);
            zM6890g2 = ir1Var.m6890g(a05Var3) | ir1Var.m6890g(e73Var);
            Object objM6869O13 = ir1Var.m6869O();
            obj2 = objM6869O13;
            if (zM6890g2) {
                df2 df2Var6 = df2.f17011a;
                nh1 nh1VarM5334I6 = ev0.m5334I(e73Var.mo3502a(df2Var6), e73Var.mo3505d(), e73Var.mo3503b(df2Var6), e73Var.mo3504c());
                ob1 ob1Var6 = new ob1();
                ob1Var6.f26536a = a05Var3;
                ob1Var6.f26537b = nh1VarM5334I6;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(ob1Var6);
                obj2 = ob1Var6;
            } else {
                df2 df2Var7 = df2.f17011a;
                nh1 nh1VarM5334I7 = ev0.m5334I(e73Var.mo3502a(df2Var7), e73Var.mo3505d(), e73Var.mo3503b(df2Var7), e73Var.mo3504c());
                ob1 ob1Var7 = new ob1();
                ob1Var7.f26536a = a05Var3;
                ob1Var7.f26537b = nh1VarM5334I7;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(ob1Var7);
                obj2 = ob1Var7;
            }
            a05 a05Var7 = (a05) obj2;
            if (a91Var4 != null) {
                nt2VarMo7630d = nt2Var3.mo7630d(d24.m4289D(kt2Var, a91Var4.f180e, null));
            } else {
                nt2VarMo7630d = nt2Var3;
            }
            ne0 ne0Var4 = new ne0((byte) 26);
            ne0Var4.f25728b = a91Var4;
            ne0Var4.f25729c = mq1Var6;
            VarHandle.storeStoreFence();
            pg0 pg0VarM11834R7 = vd6.m11834R(1738185501, ne0Var4, ir1Var);
            if (mq1Var5 == null) {
                mq1Var7 = C0006a5.f103c;
            } else {
                mq1Var7 = mq1Var5;
            }
            nt2 nt2Var7 = nt2Var3;
            en0 en0Var4 = new en0((byte) 16);
            VarHandle.storeStoreFence();
            pg0 pg0VarM11834R8 = vd6.m11834R(1098057056, en0Var4, ir1Var);
            nh2 nh2Var4 = new nh2((byte) 6);
            nh2Var4.f25807d = mq1Var6;
            nh2Var4.f25805b = e73Var;
            nh2Var4.f25808e = mq1Var5;
            nh2Var4.f25806c = pg0Var;
            VarHandle.storeStoreFence();
            mq1 mq1Var14 = mq1Var6;
            mq1 mq1Var15 = mq1Var5;
            AbstractC1356y5.m12910d(nt2VarMo7630d, pg0VarM11834R7, mq1Var7, null, pg0VarM11834R8, i8, 0L, 0L, a05Var7, vd6.m11834R(2077483048, nh2Var4, ir1Var), ir1Var, 805330992, 200);
            b = i8;
            nt2Var2 = nt2Var7;
            a91Var2 = a91Var4;
            a05Var2 = a05Var3;
            mq1Var3 = mq1Var14;
            mq1Var4 = mq1Var15;
        } else {
            ir1Var.m6874W();
            nt2Var2 = nt2Var;
            b = i;
            a05Var2 = a05Var;
            a91Var2 = a91Var;
        }
        yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            qa1 qa1Var4 = new qa1();
            qa1Var4.f28331a = nt2Var2;
            qa1Var4.f28332b = mq1Var3;
            qa1Var4.f28333c = mq1Var4;
            qa1Var4.f28334d = b;
            qa1Var4.f28335e = a05Var2;
            qa1Var4.f28336f = a91Var2;
            qa1Var4.f28337g = pg0Var;
            qa1Var4.f28338h = i2;
            qa1Var4.f28339i = i3;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = qa1Var4;
        }
    }
}
