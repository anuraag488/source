package p000;

import java.lang.invoke.VarHandle;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class so2 extends db3 implements iu2, s63, zq2 {

    /* JADX INFO: renamed from: s */
    public static final el1 f30430s = new el1(26);

    /* JADX INFO: renamed from: t */
    public static final el1 f30431t = new el1(27);

    /* JADX INFO: renamed from: f */
    public ro2 f30432f;

    /* JADX INFO: renamed from: g */
    public yp1 f30433g;

    /* JADX INFO: renamed from: h */
    public mq1 f30434h;

    /* JADX INFO: renamed from: i */
    public yp1 f30435i;

    /* JADX INFO: renamed from: j */
    public fb3 f30436j;

    /* JADX INFO: renamed from: k */
    public lw2 f30437k;

    /* JADX INFO: renamed from: l */
    public boolean f30438l;

    /* JADX INFO: renamed from: m */
    public lw2 f30439m;

    /* JADX INFO: renamed from: n */
    public boolean f30440n;

    /* JADX INFO: renamed from: o */
    public boolean f30441o;

    /* JADX INFO: renamed from: p */
    public final to2 f30442p;

    /* JADX INFO: renamed from: q */
    public x72 f30443q;

    /* JADX INFO: renamed from: r */
    public lw2 f30444r;

    public so2() {
        to2 to2Var = new to2((byte) 0);
        to2Var.f31287c = this;
        VarHandle.storeStoreFence();
        this.f30442p = to2Var;
    }

    /* JADX INFO: renamed from: J0 */
    public static void m10880J0(e13 e13Var) {
        xf2 xf2Var;
        e13 e13Var2 = e13Var.f17628x;
        wf2 wf2Var = e13Var.f17625u;
        if (!z62.m13387o(e13Var2 != null ? e13Var2.f17625u : null, wf2Var)) {
            wf2Var.f33300H.f14483p.f33640y.m12691f();
            return;
        }
        InterfaceC0718ha interfaceC0718haMo6288y = wf2Var.f33300H.f14483p.mo6288y();
        if (interfaceC0718haMo6288y == null || (xf2Var = ((wq2) interfaceC0718haMo6288y).f33640y) == null) {
            return;
        }
        xf2Var.m12691f();
    }

    /* JADX INFO: renamed from: C0 */
    public abstract cf2 mo4852C0();

    /* JADX INFO: renamed from: D0 */
    public abstract boolean mo4853D0();

    /* JADX INFO: renamed from: E0 */
    public abstract wf2 mo4854E0();

    /* JADX INFO: renamed from: F */
    public boolean mo3599F() {
        return mo4854E0().m12256J();
    }

    /* JADX INFO: renamed from: F0 */
    public abstract yq2 mo4855F0();

    /* JADX INFO: renamed from: G0 */
    public abstract so2 mo4856G0();

    /* JADX INFO: renamed from: H0 */
    public abstract long mo4857H0();

    /* JADX INFO: renamed from: I0 */
    public final ro2 m10881I0() {
        ro2 ro2Var = this.f30432f;
        if (ro2Var != null) {
            return ro2Var;
        }
        ro2 ro2Var2 = new ro2(this);
        this.f30432f = ro2Var2;
        return ro2Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K0 */
    public final void m10882K0(mw2 mw2Var) {
        wf2 wf2Var;
        Object[] objArr = mw2Var.f25258b;
        long[] jArr = mw2Var.f25257a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128 && (wf2Var = (wf2) ((ez4) objArr[(i << 3) + i3]).get()) != null) {
                        if (mo3587z()) {
                            wf2Var.m12267U(false);
                        } else {
                            wf2Var.m12268W(false);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: L0 */
    public abstract void mo4858L0();

    /* JADX WARN: Code duplicated, block: B:23:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x006a A[LOOP:1: B:14:0x0033->B:24:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x006d A[EDGE_INSN: B:29:0x006d->B:25:0x006d BREAK  A[LOOP:1: B:14:0x0033->B:24:0x006a], SYNTHETIC] */
    /* JADX INFO: renamed from: M0 */
    public final void m10883M0() {
        x72 x72Var = this.f30443q;
        if (x72Var != null) {
            int i = x72Var.f34036a;
            for (int i2 = 0; i2 < i; i2++) {
                ((gx1[]) x72Var.f34037b)[i2] = null;
                ((float[]) x72Var.f34038c)[i2] = Float.NaN;
                ((byte[]) x72Var.f34039d)[i2] = 0;
            }
            x72Var.f34036a = 0;
        }
        lw2 lw2Var = this.f30444r;
        if (lw2Var == null) {
            return;
        }
        Object[] objArr = lw2Var.f24420c;
        long[] jArr = lw2Var.f24418a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            m10882K0((mw2) objArr[(i3 << 3) + i5]);
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 != length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        lw2Var.m8126a();
    }

    @Override // p000.zq2
    /* JADX INFO: renamed from: T */
    public final yq2 mo3578T(int i, int i2, Map map, yp1 yp1Var, yp1 yp1Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            q32.m9721c("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        C0841kn c0841kn = new C0841kn((byte) 1);
        c0841kn.f23245b = i;
        c0841kn.f23246c = i2;
        c0841kn.f23247d = map;
        c0841kn.f23248e = yp1Var;
        c0841kn.f23249f = yp1Var2;
        c0841kn.f23250g = this;
        VarHandle.storeStoreFence();
        return c0841kn;
    }

    @Override // p000.db3
    /* JADX INFO: renamed from: e0 */
    public final int mo4419e0(AbstractC0568da abstractC0568da) {
        int iMo8294u0;
        if (!mo4853D0() || (iMo8294u0 = mo8294u0(abstractC0568da)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        boolean z = abstractC0568da instanceof tx4;
        long j = this.f16903e;
        return iMo8294u0 + ((int) (z ? j >> 32 : 4294967295L & j));
    }

    @Override // p000.iu2
    /* JADX INFO: renamed from: s */
    public final void mo6940s(boolean z) {
        so2 so2VarMo4856G0 = mo4856G0();
        wf2 wf2VarMo4854E0 = so2VarMo4856G0 != null ? so2VarMo4856G0.mo4854E0() : null;
        if (z62.m13387o(wf2VarMo4854E0, mo4854E0())) {
            this.f30438l = z;
            return;
        }
        if ((wf2VarMo4854E0 != null ? wf2VarMo4854E0.f33300H.f14471d : null) != sf2.f30228c) {
            if ((wf2VarMo4854E0 != null ? wf2VarMo4854E0.f33300H.f14471d : null) != sf2.f30229d) {
                return;
            }
        }
        this.f30438l = z;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0108  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t0 */
    public final void m10884t0(wf2 wf2Var, gx1 gx1Var) {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        char c2;
        long j5;
        long j6;
        int i2;
        int i3;
        int i4;
        lw2 lw2Var = this.f30444r;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i5 = 8;
        if (lw2Var != null) {
            Object[] objArr = lw2Var.f24420c;
            long[] jArr3 = lw2Var.f24418a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                long j8 = 128;
                while (true) {
                    long j9 = jArr3[i6];
                    j2 = 255;
                    if ((((~j9) << c3) & j9 & j7) != j7) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j9 & 255) < j8) {
                                c2 = c3;
                                mw2 mw2Var = (mw2) objArr[(i6 << 3) + i8];
                                j5 = j7;
                                Object[] objArr2 = mw2Var.f25258b;
                                long[] jArr4 = mw2Var.f25257a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j6 = j8;
                                    int i9 = 0;
                                    int i10 = i5;
                                    while (true) {
                                        int i11 = length2;
                                        long j10 = jArr4[i9];
                                        jArr2 = jArr3;
                                        j4 = j9;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i12 = 8 - ((~(i9 - i11)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                if ((j10 & 255) < j6) {
                                                    int i14 = (i9 << 3) + i13;
                                                    wf2 wf2Var2 = (wf2) ((ez4) objArr2[i14]).get();
                                                    i3 = i13;
                                                    if (wf2Var2 != null) {
                                                        boolean zM12256J = wf2Var2.m12256J();
                                                        i4 = i8;
                                                        if (zM12256J) {
                                                        }
                                                    } else {
                                                        i4 = i8;
                                                    }
                                                    mw2Var.m8421m(i14);
                                                } else {
                                                    i3 = i13;
                                                    i4 = i8;
                                                }
                                                j10 >>= i10;
                                                i13 = i3 + 1;
                                                i8 = i4;
                                            }
                                            i = i8;
                                            if (i12 != i10) {
                                                break;
                                            }
                                        } else {
                                            i = i8;
                                        }
                                        length2 = i11;
                                        if (i9 == length2) {
                                            break;
                                        }
                                        i9++;
                                        jArr3 = jArr2;
                                        j9 = j4;
                                        i8 = i;
                                        i10 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j4 = j9;
                                    i = i8;
                                    j6 = j8;
                                }
                                i2 = 8;
                            } else {
                                jArr2 = jArr3;
                                j4 = j9;
                                i = i8;
                                c2 = c3;
                                j5 = j7;
                                j6 = j8;
                                i2 = i5;
                            }
                            i5 = i2;
                            j9 = j4 >> i2;
                            c3 = c2;
                            j7 = j5;
                            j8 = j6;
                            i8 = i + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                        if (i7 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c3 = c;
                    j7 = j;
                    j8 = j3;
                    jArr3 = jArr;
                    i5 = 8;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 255;
                j3 = 128;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 255;
            j3 = 128;
        }
        lw2 lw2Var2 = this.f30444r;
        if (lw2Var2 != null) {
            long[] jArr5 = lw2Var2.f24418a;
            int length3 = jArr5.length - 2;
            if (length3 >= 0) {
                int i15 = 0;
                while (true) {
                    long j11 = jArr5[i15];
                    if ((((~j11) << c) & j11 & j) != j) {
                        int i16 = 8 - ((~(i15 - length3)) >>> 31);
                        for (int i17 = 0; i17 < i16; i17++) {
                            if ((j11 & j2) < j3) {
                                int i18 = (i15 << 3) + i17;
                                if (((mw2) lw2Var2.f24420c[i18]).m8415g()) {
                                    lw2Var2.m8137l(i18);
                                }
                            }
                            j11 >>= 8;
                        }
                        if (i16 != 8) {
                            break;
                        }
                    }
                    if (i15 == length3) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
        }
        lw2 lw2Var3 = this.f30444r;
        if (lw2Var3 == null) {
            lw2Var3 = new lw2();
            this.f30444r = lw2Var3;
        }
        Object objM8132g = lw2Var3.m8132g(gx1Var);
        if (objM8132g == null) {
            objM8132g = new mw2();
            lw2Var3.m8138m(gx1Var, objM8132g);
        }
        ((mw2) objM8132g).m8419k(new ez4(wf2Var));
    }

    /* JADX INFO: renamed from: u0 */
    public abstract int mo8294u0(AbstractC0568da abstractC0568da);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v0 */
    public final void m10885v0(fb3 fb3Var, long j, long j2) {
        boolean z;
        char c;
        long j3;
        long j4;
        wf2 wf2Var;
        boolean z2;
        int i;
        char c2;
        mw2 mw2Var;
        u63 snapshotObserver;
        so2 so2Var = this;
        lw2 lw2Var = so2Var.f30444r;
        x72 x72Var = so2Var.f30443q;
        if (x72Var == null) {
            x72Var = new x72((byte) 2);
            so2Var.f30443q = x72Var;
        }
        r63 r63Var = so2Var.mo4854E0().f33325o;
        if (r63Var != null && (snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) r63Var).getSnapshotObserver()) != null) {
            qo2 qo2Var = new qo2();
            qo2Var.f28639a = so2Var;
            qo2Var.f28640b = j;
            qo2Var.f28641c = j2;
            qo2Var.f28642d = fb3Var;
            VarHandle.storeStoreFence();
            snapshotObserver.f31675a.m159e(fb3Var, f30430s, qo2Var);
        }
        boolean zMo3587z = so2Var.mo3587z();
        mw2 mw2Var2 = (mw2) x72Var.f34040e;
        mw2 mw2Var3 = (mw2) x72Var.f34041f;
        int i2 = x72Var.f34036a;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = ((byte[]) x72Var.f34039d)[i3];
            if (b == 3) {
                mw2Var3.m8419k(((gx1[]) x72Var.f34037b)[i3]);
            } else if (b != 0 && lw2Var != null && (mw2Var = (mw2) lw2Var.m8136k(((gx1[]) x72Var.f34037b)[i3])) != null) {
                mw2Var2.m8418j(mw2Var);
            }
        }
        int i4 = x72Var.f34036a;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = (byte[]) x72Var.f34039d;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                gx1[] gx1VarArr = (gx1[]) x72Var.f34037b;
                gx1VarArr[i6 - i5] = gx1VarArr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = x72Var.f34036a;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            ((gx1[]) x72Var.f34037b)[i8] = null;
        }
        x72Var.f34036a -= i5;
        so2 so2VarMo4856G0 = so2Var.mo4856G0();
        Object[] objArr = mw2Var3.f25258b;
        long[] jArr = mw2Var3.f25257a;
        int length = jArr.length - 2;
        char c3 = 7;
        int i9 = 8;
        if (length >= 0) {
            j3 = 128;
            int i10 = 0;
            while (true) {
                long j5 = jArr[i10];
                j4 = 255;
                if ((((~j5) << c3) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j5 & 255) < 128) {
                            c2 = c3;
                            gx1 gx1Var = (gx1) objArr[(i10 << 3) + i12];
                            so2 so2Var2 = so2VarMo4856G0 == null ? so2Var : so2VarMo4856G0;
                            i = i9;
                            so2 so2Var3 = so2Var2;
                            while (true) {
                                x72 x72Var2 = so2Var3.f30443q;
                                if (x72Var2 != null) {
                                    z2 = zMo3587z;
                                    if (AbstractC0990oo.m9195P(gx1Var, (gx1[]) x72Var2.f34037b)) {
                                        break;
                                    } else {
                                        break;
                                    }
                                }
                                z2 = zMo3587z;
                                so2 so2VarMo4856G1 = so2Var3.mo4856G0();
                                if (so2VarMo4856G1 == null) {
                                    break;
                                }
                                so2Var3 = so2VarMo4856G1;
                                zMo3587z = z2;
                            }
                            lw2 lw2Var2 = so2Var3.f30444r;
                            mw2 mw2Var4 = lw2Var2 != null ? (mw2) lw2Var2.m8136k(gx1Var) : null;
                            if (mw2Var4 != null) {
                                so2Var2.m10882K0(mw2Var4);
                            }
                        } else {
                            z2 = zMo3587z;
                            i = i9;
                            c2 = c3;
                        }
                        j5 >>= i;
                        i12++;
                        so2Var = this;
                        c3 = c2;
                        i9 = i;
                        zMo3587z = z2;
                    }
                    z = zMo3587z;
                    c = c3;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    z = zMo3587z;
                    c = c3;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                so2Var = this;
                c3 = c;
                zMo3587z = z;
                i9 = 8;
            }
        } else {
            z = zMo3587z;
            c = 7;
            j3 = 128;
            j4 = 255;
        }
        mw2Var3.m8410b();
        Object[] objArr2 = mw2Var2.f25258b;
        long[] jArr2 = mw2Var2.f25257a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j6 = jArr2[i13];
                if ((((~j6) << c) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j6 & j4) < j3 && (wf2Var = (wf2) ((ez4) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (z) {
                                wf2Var.m12267U(false);
                            } else {
                                wf2Var.m12268W(false);
                            }
                        }
                        j6 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length2) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        mw2Var2.m8410b();
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x011f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0123  */
    /* JADX WARN: Code duplicated, block: B:69:0x012a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0132  */
    /* JADX WARN: Code duplicated, block: B:72:0x0135  */
    /* JADX INFO: renamed from: y0 */
    public final void m10886y0(yq2 yq2Var) {
        long j;
        char c;
        long j2;
        long j3;
        ro2 ro2Var;
        lw2 lw2Var;
        long[] jArr;
        Object[] objArr;
        int i;
        long[] jArr2;
        Object[] objArr2;
        int i2;
        boolean z;
        x72 x72Var;
        lw2 lw2Var2;
        mw2 mw2Var;
        ro2 ro2Var2;
        long j4;
        if (this.f30441o) {
            return;
        }
        yp1 yp1VarMo4505e = yq2Var.mo4505e();
        mq1 mq1VarMo5704c = yq2Var.mo5704c();
        yp1 yp1VarMo5705f = yq2Var.mo5705f();
        long jMo4004R = 0;
        if (mq1VarMo5704c == null) {
            long jM12827F0 = 9223372034707292159L;
            if (yp1VarMo4505e == null) {
                m10883M0();
                this.f30433g = null;
                this.f30434h = null;
                this.f30435i = null;
                ro2 ro2Var3 = this.f30432f;
                if (ro2Var3 != null) {
                    ro2Var3.f29473a = false;
                }
                if (ro2Var3 != null) {
                    ro2Var3.f29474b = 9223372034707292159L;
                    return;
                }
                return;
            }
            this.f30434h = null;
            this.f30435i = null;
            boolean z2 = this.f30433g != yp1VarMo4505e;
            if (!z2 && m10881I0().f29473a) {
                cf2 cf2VarMo4852C0 = mo4852C0();
                jM12827F0 = y42.m12827F0(cf2VarMo4852C0.mo4007b(0L));
                jMo4004R = cf2VarMo4852C0.mo4004R();
                z2 = (o52.m8956c(jM12827F0, m10881I0().f29474b) && w52.m12108c(jMo4004R, m10881I0().f29475c)) ? false : true;
            }
            if (z2) {
                fb3 fb3Var = this.f30436j;
                if (fb3Var != null) {
                    fb3Var.f18892a = yq2Var;
                } else {
                    fb3Var = new fb3(yq2Var, this, null);
                    this.f30436j = fb3Var;
                }
                m10885v0(fb3Var, jM12827F0, jMo4004R);
                this.f30433g = yq2Var.mo4505e();
                return;
            }
            return;
        }
        if (mq1VarMo5704c != this.f30434h || yp1VarMo5705f != this.f30435i) {
            this.f30434h = mq1VarMo5704c;
            this.f30435i = yp1VarMo5705f;
            m10883M0();
            return;
        }
        lw2 lw2Var3 = this.f30439m;
        long j5 = -9187201950435737472L;
        int i3 = 8;
        if (lw2Var3 != null) {
            Object[] objArr3 = lw2Var3.f24420c;
            long[] jArr3 = lw2Var3.f24418a;
            j2 = 128;
            int length = jArr3.length - 2;
            if (length >= 0) {
                c = 7;
                int i4 = 0;
                ro2Var2 = null;
                while (true) {
                    long j6 = jArr3[i4];
                    j3 = 255;
                    if ((((~j6) << 7) & j6 & j5) != j5) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j6 & 255) < 128) {
                                j4 = j5;
                                ro2 ro2Var4 = (ro2) objArr3[(i4 << 3) + i6];
                                if (ro2Var4.f29473a) {
                                    ro2Var2 = ro2Var4;
                                }
                            } else {
                                j4 = j5;
                            }
                            j6 >>= 8;
                            i6++;
                            j5 = j4;
                        }
                        j = j5;
                        if (i5 != 8) {
                            break;
                        }
                    } else {
                        j = j5;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    j5 = j;
                }
            } else {
                j = -9187201950435737472L;
                c = 7;
                j3 = 255;
                ro2Var2 = null;
            }
            ro2Var = ro2Var2;
        } else {
            j = -9187201950435737472L;
            c = 7;
            j2 = 128;
            j3 = 255;
            ro2Var = null;
        }
        if (ro2Var == null) {
            return;
        }
        cf2 cf2VarMo4852C1 = mo4852C0();
        long jM12827F1 = y42.m12827F0(cf2VarMo4852C1.mo4007b(0L));
        long jMo4004R2 = cf2VarMo4852C1.mo4004R();
        if ((o52.m8956c(jM12827F1, ro2Var.f29474b) && w52.m12108c(jMo4004R2, ro2Var.f29475c)) || (lw2Var = this.f30439m) == null) {
            return;
        }
        Object[] objArr4 = lw2Var.f24419b;
        Object[] objArr5 = lw2Var.f24420c;
        long[] jArr4 = lw2Var.f24418a;
        int length2 = jArr4.length - 2;
        if (length2 < 0) {
            return;
        }
        int i7 = 0;
        while (true) {
            long j7 = jArr4[i7];
            int i8 = length2;
            if ((((~j7) << c) & j7 & j) != j) {
                int i9 = 8 - ((~(i7 - i8)) >>> 31);
                int i10 = 0;
                while (i10 < i9) {
                    if ((j7 & j3) < j2) {
                        int i11 = (i7 << 3) + i10;
                        Object obj = objArr4[i11];
                        ro2 ro2Var5 = (ro2) objArr5[i11];
                        i2 = i3;
                        gx1 gx1Var = (gx1) obj;
                        jArr2 = jArr4;
                        if (ro2Var5.f29473a) {
                            objArr2 = objArr4;
                            z = (w52.m12108c(ro2Var5.f29475c, jMo4004R2) && o52.m8956c(ro2Var5.f29474b, jM12827F1)) ? false : true;
                            ro2Var5.f29475c = jMo4004R2;
                            ro2Var5.f29474b = jM12827F1;
                            ro2Var5.f29473a = false;
                            if (!z) {
                                x72Var = this.f30443q;
                                if (x72Var != null) {
                                    x72Var.m12524k(gx1Var);
                                }
                                lw2Var2 = this.f30444r;
                                if (lw2Var2 != null) {
                                    mw2Var = (mw2) lw2Var2.m8132g(gx1Var);
                                } else {
                                    mw2Var = null;
                                }
                                if (mw2Var != null) {
                                    m10882K0(mw2Var);
                                    mw2Var.m8410b();
                                }
                            }
                        } else {
                            objArr2 = objArr4;
                        }
                        ro2Var5.f29475c = jMo4004R2;
                        ro2Var5.f29474b = jM12827F1;
                        ro2Var5.f29473a = false;
                        if (!z) {
                            x72Var = this.f30443q;
                            if (x72Var != null) {
                                x72Var.m12524k(gx1Var);
                            }
                            lw2Var2 = this.f30444r;
                            if (lw2Var2 != null) {
                                mw2Var = (mw2) lw2Var2.m8132g(gx1Var);
                            } else {
                                mw2Var = null;
                            }
                            if (mw2Var != null) {
                                m10882K0(mw2Var);
                                mw2Var.m8410b();
                            }
                        }
                    } else {
                        jArr2 = jArr4;
                        objArr2 = objArr4;
                        i2 = i3;
                    }
                    j7 >>= i2;
                    i10++;
                    objArr4 = objArr2;
                    i3 = i2;
                    jArr4 = jArr2;
                }
                jArr = jArr4;
                objArr = objArr4;
                i = i3;
                if (i9 != i) {
                    return;
                }
            } else {
                jArr = jArr4;
                objArr = objArr4;
                i = i3;
            }
            length2 = i8;
            if (i7 == length2) {
                return;
            }
            i7++;
            i3 = i;
            objArr4 = objArr;
            jArr4 = jArr;
        }
    }

    @Override // p000.s62
    /* JADX INFO: renamed from: z */
    public boolean mo3587z() {
        return false;
    }

    /* JADX INFO: renamed from: z0 */
    public abstract so2 mo4896z0();
}
