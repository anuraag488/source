package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class zp4 {

    /* JADX INFO: renamed from: e */
    public static final zp4 f36252e = new zp4(0, 0, new Object[0], null);

    /* JADX INFO: renamed from: a */
    public int f36253a;

    /* JADX INFO: renamed from: b */
    public int f36254b;

    /* JADX INFO: renamed from: c */
    public final q50 f36255c;

    /* JADX INFO: renamed from: d */
    public Object[] f36256d;

    public zp4(int i, int i2, Object[] objArr, q50 q50Var) {
        this.f36253a = i;
        this.f36254b = i2;
        this.f36255c = q50Var;
        this.f36256d = objArr;
    }

    /* JADX INFO: renamed from: j */
    public static zp4 m13696j(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, q50 q50Var) {
        if (i3 > 30) {
            return new zp4(0, 0, new Object[]{obj, obj2, obj3, obj4}, q50Var);
        }
        int iM5356f0 = ev0.m5356f0(i, i3);
        int iM5356f1 = ev0.m5356f0(i2, i3);
        if (iM5356f0 != iM5356f1) {
            return new zp4((1 << iM5356f0) | (1 << iM5356f1), 0, iM5356f0 < iM5356f1 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, q50Var);
        }
        return new zp4(0, 1 << iM5356f0, new Object[]{m13696j(i, obj, obj2, i2, obj3, obj4, i3 + 5, q50Var)}, q50Var);
    }

    /* JADX INFO: renamed from: a */
    public final Object[] m13697a(int i, int i2, int i3, Object obj, Object obj2, int i4, q50 q50Var) {
        Object obj3 = this.f36256d[i];
        zp4 zp4VarM13696j = m13696j(obj3 != null ? obj3.hashCode() : 0, obj3, m13719x(i), i3, obj, obj2, i4 + 5, q50Var);
        int iM13715t = m13715t(i2);
        int i5 = iM13715t + 1;
        Object[] objArr = this.f36256d;
        Object[] objArr2 = new Object[objArr.length - 1];
        AbstractC0990oo.m9201V(0, i, 6, objArr, objArr2);
        AbstractC0990oo.m9198S(i, i + 2, i5, objArr, objArr2);
        objArr2[iM13715t - 1] = zp4VarM13696j;
        AbstractC0990oo.m9198S(iM13715t, i5, objArr.length, objArr, objArr2);
        return objArr2;
    }

    /* JADX INFO: renamed from: b */
    public final int m13698b() {
        if (this.f36254b == 0) {
            return this.f36256d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f36253a);
        int length = this.f36256d.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += m13714s(i).m13698b();
        }
        return iBitCount;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m13699c(Object obj) {
        p52 p52VarM10654Z = sc6.m10654Z(sc6.m10660c0(0, this.f36256d.length), 2);
        int i = p52VarM10654Z.f27382a;
        int i2 = p52VarM10654Z.f27383b;
        int i3 = p52VarM10654Z.f27384c;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!z62.m13387o(obj, this.f36256d[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m13700d(int i, int i2, Object obj) {
        int iM5356f0 = 1 << ev0.m5356f0(i, i2);
        if (m13704h(iM5356f0)) {
            return z62.m13387o(obj, this.f36256d[m13702f(iM5356f0)]);
        }
        if (!m13705i(iM5356f0)) {
            return false;
        }
        zp4 zp4VarM13714s = m13714s(m13715t(iM5356f0));
        return i2 == 30 ? zp4VarM13714s.m13699c(obj) : zp4VarM13714s.m13700d(i, i2 + 5, obj);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m13701e(zp4 zp4Var) {
        if (this == zp4Var) {
            return true;
        }
        if (this.f36254b == zp4Var.f36254b && this.f36253a == zp4Var.f36253a) {
            int length = this.f36256d.length;
            for (int i = 0; i < length; i++) {
                if (this.f36256d[i] == zp4Var.f36256d[i]) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final int m13702f(int i) {
        return Integer.bitCount(this.f36253a & (i - 1)) * 2;
    }

    /* JADX INFO: renamed from: g */
    public final Object m13703g(int i, int i2, Object obj) {
        int iM5356f0 = 1 << ev0.m5356f0(i, i2);
        if (m13704h(iM5356f0)) {
            int iM13702f = m13702f(iM5356f0);
            if (z62.m13387o(obj, this.f36256d[iM13702f])) {
                return m13719x(iM13702f);
            }
            return null;
        }
        if (!m13705i(iM5356f0)) {
            return null;
        }
        zp4 zp4VarM13714s = m13714s(m13715t(iM5356f0));
        if (i2 != 30) {
            return zp4VarM13714s.m13703g(i, i2 + 5, obj);
        }
        p52 p52VarM10654Z = sc6.m10654Z(sc6.m10660c0(0, zp4VarM13714s.f36256d.length), 2);
        int i3 = p52VarM10654Z.f27382a;
        int i4 = p52VarM10654Z.f27383b;
        int i5 = p52VarM10654Z.f27384c;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!z62.m13387o(obj, zp4VarM13714s.f36256d[i3])) {
            if (i3 == i4) {
                return null;
            }
            i3 += i5;
        }
        return zp4VarM13714s.m13719x(i3);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m13704h(int i) {
        return (this.f36253a & i) != 0;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m13705i(int i) {
        return (this.f36254b & i) != 0;
    }

    /* JADX INFO: renamed from: k */
    public final zp4 m13706k(int i, ja3 ja3Var) {
        ja3Var.m7062c(ja3Var.f22138f - 1);
        ja3Var.f22136d = m13719x(i);
        Object[] objArr = this.f36256d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f36255c != ja3Var.f22134b) {
            return new zp4(0, 0, ev0.m5368r0(i, objArr), ja3Var.f22134b);
        }
        this.f36256d = ev0.m5368r0(i, objArr);
        return this;
    }

    /* JADX INFO: renamed from: l */
    public final zp4 m13707l(int i, Object obj, Object obj2, int i2, ja3 ja3Var) {
        ja3 ja3Var2;
        zp4 zp4VarM13707l;
        int iM5356f0 = 1 << ev0.m5356f0(i, i2);
        boolean zM13704h = m13704h(iM5356f0);
        q50 q50Var = this.f36255c;
        if (zM13704h) {
            int iM13702f = m13702f(iM5356f0);
            if (!z62.m13387o(obj, this.f36256d[iM13702f])) {
                ja3Var.m7062c(ja3Var.f22138f + 1);
                q50 q50Var2 = ja3Var.f22134b;
                if (q50Var != q50Var2) {
                    return new zp4(this.f36253a ^ iM5356f0, this.f36254b | iM5356f0, m13697a(iM13702f, iM5356f0, i, obj, obj2, i2, q50Var2), q50Var2);
                }
                this.f36256d = m13697a(iM13702f, iM5356f0, i, obj, obj2, i2, q50Var2);
                this.f36253a ^= iM5356f0;
                this.f36254b |= iM5356f0;
                return this;
            }
            ja3Var.f22136d = m13719x(iM13702f);
            if (m13719x(iM13702f) == obj2) {
                return this;
            }
            if (q50Var == ja3Var.f22134b) {
                this.f36256d[iM13702f + 1] = obj2;
                return this;
            }
            ja3Var.f22137e++;
            Object[] objArr = this.f36256d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf[iM13702f + 1] = obj2;
            return new zp4(this.f36253a, this.f36254b, objArrCopyOf, ja3Var.f22134b);
        }
        if (!m13705i(iM5356f0)) {
            ja3Var.m7062c(ja3Var.f22138f + 1);
            q50 q50Var3 = ja3Var.f22134b;
            int iM13702f2 = m13702f(iM5356f0);
            Object[] objArr2 = this.f36256d;
            if (q50Var != q50Var3) {
                return new zp4(this.f36253a | iM5356f0, this.f36254b, ev0.m5357g0(objArr2, iM13702f2, obj, obj2), q50Var3);
            }
            this.f36256d = ev0.m5357g0(objArr2, iM13702f2, obj, obj2);
            this.f36253a |= iM5356f0;
            return this;
        }
        int iM13715t = m13715t(iM5356f0);
        zp4 zp4VarM13714s = m13714s(iM13715t);
        if (i2 == 30) {
            p52 p52VarM10654Z = sc6.m10654Z(sc6.m10660c0(0, zp4VarM13714s.f36256d.length), 2);
            int i3 = p52VarM10654Z.f27382a;
            int i4 = p52VarM10654Z.f27383b;
            int i5 = p52VarM10654Z.f27384c;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (!z62.m13387o(obj, zp4VarM13714s.f36256d[i3])) {
                        if (i3 == i4) {
                            ja3Var.m7062c(ja3Var.f22138f + 1);
                            zp4VarM13707l = new zp4(0, 0, ev0.m5357g0(zp4VarM13714s.f36256d, 0, obj, obj2), ja3Var.f22134b);
                            break;
                        }
                        i3 += i5;
                    } else {
                        ja3Var.f22136d = zp4VarM13714s.m13719x(i3);
                        if (zp4VarM13714s.f36255c != ja3Var.f22134b) {
                            ja3Var.f22137e++;
                            Object[] objArr3 = zp4VarM13714s.f36256d;
                            Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                            objArrCopyOf2[i3 + 1] = obj2;
                            zp4VarM13707l = new zp4(0, 0, objArrCopyOf2, ja3Var.f22134b);
                            break;
                        }
                        zp4VarM13714s.f36256d[i3 + 1] = obj2;
                        zp4VarM13707l = zp4VarM13714s;
                        break;
                    }
                }
            } else {
                ja3Var.m7062c(ja3Var.f22138f + 1);
                zp4VarM13707l = new zp4(0, 0, ev0.m5357g0(zp4VarM13714s.f36256d, 0, obj, obj2), ja3Var.f22134b);
                break;
            }
            ja3Var2 = ja3Var;
        } else {
            ja3Var2 = ja3Var;
            zp4VarM13707l = zp4VarM13714s.m13707l(i, obj, obj2, i2 + 5, ja3Var2);
        }
        return zp4VarM13714s == zp4VarM13707l ? this : m13713r(iM13715t, zp4VarM13707l, ja3Var2.f22134b);
    }

    /* JADX INFO: renamed from: m */
    public final zp4 m13708m(zp4 zp4Var, int i, jy0 jy0Var, ja3 ja3Var) {
        zp4 zp4Var2;
        Object[] objArr;
        zp4 zp4VarM13696j;
        if (this == zp4Var) {
            jy0Var.f22740a += m13698b();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            q50 q50Var = ja3Var.f22134b;
            Object[] objArr2 = this.f36256d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + zp4Var.f36256d.length);
            int length = this.f36256d.length;
            p52 p52VarM10654Z = sc6.m10654Z(sc6.m10660c0(0, zp4Var.f36256d.length), 2);
            int i3 = p52VarM10654Z.f27382a;
            int i4 = p52VarM10654Z.f27383b;
            int i5 = p52VarM10654Z.f27384c;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (m13699c(zp4Var.f36256d[i3])) {
                        jy0Var.f22740a++;
                    } else {
                        Object[] objArr3 = zp4Var.f36256d;
                        objArrCopyOf[length] = objArr3[i3];
                        objArrCopyOf[length + 1] = objArr3[i3 + 1];
                        length += 2;
                    }
                    if (i3 == i4) {
                        break;
                    }
                    i3 += i5;
                }
            }
            if (length != this.f36256d.length) {
                if (length != zp4Var.f36256d.length) {
                    return length == objArrCopyOf.length ? new zp4(0, 0, objArrCopyOf, q50Var) : new zp4(0, 0, Arrays.copyOf(objArrCopyOf, length), q50Var);
                }
            }
            return this;
        }
        int i6 = this.f36254b | zp4Var.f36254b;
        int i7 = this.f36253a;
        int i8 = zp4Var.f36253a;
        int i9 = (i7 ^ i8) & (~i6);
        int i10 = i7 & i8;
        int i11 = i9;
        while (i10 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i10);
            if (z62.m13387o(this.f36256d[m13702f(iLowestOneBit)], zp4Var.f36256d[zp4Var.m13702f(iLowestOneBit)])) {
                i11 |= iLowestOneBit;
            } else {
                i6 |= iLowestOneBit;
            }
            i10 ^= iLowestOneBit;
        }
        if ((i6 & i11) != 0) {
            kd3.m7503b("Check failed.");
        }
        if (z62.m13387o(this.f36255c, ja3Var.f22134b) && this.f36253a == i11 && this.f36254b == i6) {
            zp4Var2 = this;
        } else {
            zp4Var2 = new zp4(i11, i6, new Object[Integer.bitCount(i6) + (Integer.bitCount(i11) * 2)], null);
        }
        int i12 = i6;
        int i13 = 0;
        while (i12 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i12);
            Object[] objArr4 = zp4Var2.f36256d;
            int length2 = (objArr4.length - 1) - i13;
            if (m13705i(iLowestOneBit2)) {
                zp4VarM13696j = m13714s(m13715t(iLowestOneBit2));
                if (zp4Var.m13705i(iLowestOneBit2)) {
                    zp4VarM13696j = zp4VarM13696j.m13708m(zp4Var.m13714s(zp4Var.m13715t(iLowestOneBit2)), i + 5, jy0Var, ja3Var);
                    objArr = objArr4;
                } else if (zp4Var.m13704h(iLowestOneBit2)) {
                    int iM13702f = zp4Var.m13702f(iLowestOneBit2);
                    Object obj = zp4Var.f36256d[iM13702f];
                    Object objM13719x = zp4Var.m13719x(iM13702f);
                    int i14 = ja3Var.f22138f;
                    objArr = objArr4;
                    zp4VarM13696j = zp4VarM13696j.m13707l(obj != null ? obj.hashCode() : i2, obj, objM13719x, i + 5, ja3Var);
                    if (ja3Var.f22138f == i14) {
                        jy0Var.f22740a++;
                    }
                } else {
                    objArr = objArr4;
                }
            } else {
                objArr = objArr4;
                if (zp4Var.m13705i(iLowestOneBit2)) {
                    zp4 zp4VarM13714s = zp4Var.m13714s(zp4Var.m13715t(iLowestOneBit2));
                    if (m13704h(iLowestOneBit2)) {
                        int iM13702f2 = m13702f(iLowestOneBit2);
                        Object obj2 = this.f36256d[iM13702f2];
                        int i15 = i + 5;
                        if (zp4VarM13714s.m13700d(obj2 != null ? obj2.hashCode() : 0, i15, obj2)) {
                            jy0Var.f22740a++;
                            zp4VarM13696j = zp4VarM13714s;
                        } else {
                            zp4VarM13696j = zp4VarM13714s.m13707l(obj2 != null ? obj2.hashCode() : 0, obj2, m13719x(iM13702f2), i15, ja3Var);
                        }
                    } else {
                        zp4VarM13696j = zp4VarM13714s;
                    }
                } else {
                    int iM13702f3 = m13702f(iLowestOneBit2);
                    Object obj3 = this.f36256d[iM13702f3];
                    Object objM13719x2 = m13719x(iM13702f3);
                    int iM13702f4 = zp4Var.m13702f(iLowestOneBit2);
                    Object obj4 = zp4Var.f36256d[iM13702f4];
                    zp4VarM13696j = m13696j(obj3 != null ? obj3.hashCode() : 0, obj3, objM13719x2, obj4 != null ? obj4.hashCode() : 0, obj4, zp4Var.m13719x(iM13702f4), i + 5, ja3Var.f22134b);
                }
            }
            objArr[length2] = zp4VarM13696j;
            i13++;
            i12 ^= iLowestOneBit2;
            i2 = 0;
        }
        int i16 = 0;
        while (i11 != 0) {
            int iLowestOneBit3 = Integer.lowestOneBit(i11);
            int i17 = i16 * 2;
            if (zp4Var.m13704h(iLowestOneBit3)) {
                int iM13702f5 = zp4Var.m13702f(iLowestOneBit3);
                Object[] objArr5 = zp4Var2.f36256d;
                objArr5[i17] = zp4Var.f36256d[iM13702f5];
                objArr5[i17 + 1] = zp4Var.m13719x(iM13702f5);
                if (m13704h(iLowestOneBit3)) {
                    jy0Var.f22740a++;
                }
            } else {
                int iM13702f6 = m13702f(iLowestOneBit3);
                Object[] objArr6 = zp4Var2.f36256d;
                objArr6[i17] = this.f36256d[iM13702f6];
                objArr6[i17 + 1] = m13719x(iM13702f6);
            }
            i16++;
            i11 ^= iLowestOneBit3;
        }
        if (!m13701e(zp4Var2)) {
            return zp4Var.m13701e(zp4Var2) ? zp4Var : zp4Var2;
        }
        return this;
    }

    /* JADX INFO: renamed from: n */
    public final zp4 m13709n(int i, Object obj, int i2, ja3 ja3Var) {
        zp4 zp4VarM13709n;
        int iM5356f0 = 1 << ev0.m5356f0(i, i2);
        if (m13704h(iM5356f0)) {
            int iM13702f = m13702f(iM5356f0);
            if (z62.m13387o(obj, this.f36256d[iM13702f])) {
                return m13711p(iM13702f, iM5356f0, ja3Var);
            }
        } else if (m13705i(iM5356f0)) {
            int iM13715t = m13715t(iM5356f0);
            zp4 zp4VarM13714s = m13714s(iM13715t);
            if (i2 == 30) {
                p52 p52VarM10654Z = sc6.m10654Z(sc6.m10660c0(0, zp4VarM13714s.f36256d.length), 2);
                int i3 = p52VarM10654Z.f27382a;
                int i4 = p52VarM10654Z.f27383b;
                int i5 = p52VarM10654Z.f27384c;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (!z62.m13387o(obj, zp4VarM13714s.f36256d[i3])) {
                            if (i3 == i4) {
                                zp4VarM13709n = zp4VarM13714s;
                                break;
                            }
                            i3 += i5;
                        } else {
                            zp4VarM13709n = zp4VarM13714s.m13706k(i3, ja3Var);
                            break;
                        }
                    }
                } else {
                    zp4VarM13709n = zp4VarM13714s;
                    break;
                }
            } else {
                zp4VarM13709n = zp4VarM13714s.m13709n(i, obj, i2 + 5, ja3Var);
            }
            return m13712q(zp4VarM13714s, zp4VarM13709n, iM13715t, iM5356f0, ja3Var.f22134b);
        }
        return this;
    }

    /* JADX INFO: renamed from: o */
    public final zp4 m13710o(int i, Object obj, Object obj2, int i2, ja3 ja3Var) {
        ja3 ja3Var2;
        zp4 zp4VarM13710o;
        int iM5356f0 = 1 << ev0.m5356f0(i, i2);
        if (m13704h(iM5356f0)) {
            int iM13702f = m13702f(iM5356f0);
            return (z62.m13387o(obj, this.f36256d[iM13702f]) && z62.m13387o(obj2, m13719x(iM13702f))) ? m13711p(iM13702f, iM5356f0, ja3Var) : this;
        }
        if (!m13705i(iM5356f0)) {
            return this;
        }
        int iM13715t = m13715t(iM5356f0);
        zp4 zp4VarM13714s = m13714s(iM13715t);
        if (i2 == 30) {
            p52 p52VarM10654Z = sc6.m10654Z(sc6.m10660c0(0, zp4VarM13714s.f36256d.length), 2);
            int i3 = p52VarM10654Z.f27382a;
            int i4 = p52VarM10654Z.f27383b;
            int i5 = p52VarM10654Z.f27384c;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (!z62.m13387o(obj, zp4VarM13714s.f36256d[i3]) || !z62.m13387o(obj2, zp4VarM13714s.m13719x(i3))) {
                        if (i3 == i4) {
                            zp4VarM13710o = zp4VarM13714s;
                            break;
                        }
                        i3 += i5;
                    } else {
                        zp4VarM13710o = zp4VarM13714s.m13706k(i3, ja3Var);
                        break;
                    }
                }
            } else {
                zp4VarM13710o = zp4VarM13714s;
                break;
            }
            ja3Var2 = ja3Var;
        } else {
            ja3Var2 = ja3Var;
            zp4VarM13710o = zp4VarM13714s.m13710o(i, obj, obj2, i2 + 5, ja3Var2);
        }
        return m13712q(zp4VarM13714s, zp4VarM13710o, iM13715t, iM5356f0, ja3Var2.f22134b);
    }

    /* JADX INFO: renamed from: p */
    public final zp4 m13711p(int i, int i2, ja3 ja3Var) {
        ja3Var.m7062c(ja3Var.f22138f - 1);
        ja3Var.f22136d = m13719x(i);
        Object[] objArr = this.f36256d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f36255c != ja3Var.f22134b) {
            return new zp4(i2 ^ this.f36253a, this.f36254b, ev0.m5368r0(i, objArr), ja3Var.f22134b);
        }
        this.f36256d = ev0.m5368r0(i, objArr);
        this.f36253a ^= i2;
        return this;
    }

    /* JADX INFO: renamed from: q */
    public final zp4 m13712q(zp4 zp4Var, zp4 zp4Var2, int i, int i2, q50 q50Var) {
        q50 q50Var2 = this.f36255c;
        if (zp4Var2 != null) {
            return (q50Var2 == q50Var || zp4Var != zp4Var2) ? m13713r(i, zp4Var2, q50Var) : this;
        }
        Object[] objArr = this.f36256d;
        if (objArr.length == 1) {
            return null;
        }
        if (q50Var2 != q50Var) {
            return new zp4(this.f36253a, this.f36254b ^ i2, ev0.m5369s0(i, objArr), q50Var);
        }
        this.f36256d = ev0.m5369s0(i, objArr);
        this.f36254b ^= i2;
        return this;
    }

    /* JADX INFO: renamed from: r */
    public final zp4 m13713r(int i, zp4 zp4Var, q50 q50Var) {
        Object[] objArr = this.f36256d;
        if (objArr.length == 1 && zp4Var.f36256d.length == 2 && zp4Var.f36254b == 0) {
            zp4Var.f36253a = this.f36254b;
            return zp4Var;
        }
        if (this.f36255c == q50Var) {
            objArr[i] = zp4Var;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = zp4Var;
        return new zp4(this.f36253a, this.f36254b, objArrCopyOf, q50Var);
    }

    /* JADX INFO: renamed from: s */
    public final zp4 m13714s(int i) {
        return (zp4) this.f36256d[i];
    }

    /* JADX INFO: renamed from: t */
    public final int m13715t(int i) {
        return (this.f36256d.length - 1) - Integer.bitCount(this.f36254b & (i - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c6, code lost:
    
        if (r13 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cf, code lost:
    
        if (r13 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d2, code lost:
    
        r13.f24044c = m13718w(r11, r4, (p000.zp4) r13.f24044c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00dc, code lost:
    
        return r13;
     */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final li0 m13716u(int i, int i2, Object obj, Object obj2) {
        li0 li0VarM13716u;
        int iM5356f0 = 1 << ev0.m5356f0(i, i2);
        if (m13704h(iM5356f0)) {
            int iM13702f = m13702f(iM5356f0);
            if (!z62.m13387o(obj, this.f36256d[iM13702f])) {
                return new li0(new zp4(this.f36253a ^ iM5356f0, this.f36254b | iM5356f0, m13697a(iM13702f, iM5356f0, i, obj, obj2, i2, null), null), 1);
            }
            if (m13719x(iM13702f) != obj2) {
                Object[] objArr = this.f36256d;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                objArrCopyOf[iM13702f + 1] = obj2;
                return new li0(new zp4(this.f36253a, this.f36254b, objArrCopyOf, null), 0);
            }
        } else {
            if (!m13705i(iM5356f0)) {
                return new li0(new zp4(this.f36253a | iM5356f0, this.f36254b, ev0.m5357g0(this.f36256d, m13702f(iM5356f0), obj, obj2), null), 1);
            }
            int iM13715t = m13715t(iM5356f0);
            zp4 zp4VarM13714s = m13714s(iM13715t);
            if (i2 == 30) {
                p52 p52VarM10654Z = sc6.m10654Z(sc6.m10660c0(0, zp4VarM13714s.f36256d.length), 2);
                int i3 = p52VarM10654Z.f27382a;
                int i4 = p52VarM10654Z.f27383b;
                int i5 = p52VarM10654Z.f27384c;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (!z62.m13387o(obj, zp4VarM13714s.f36256d[i3])) {
                            if (i3 == i4) {
                                li0VarM13716u = new li0(new zp4(0, 0, ev0.m5357g0(zp4VarM13714s.f36256d, 0, obj, obj2), null), 1);
                                break;
                            }
                            i3 += i5;
                        } else {
                            if (obj2 != zp4VarM13714s.m13719x(i3)) {
                                Object[] objArr2 = zp4VarM13714s.f36256d;
                                Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                                objArrCopyOf2[i3 + 1] = obj2;
                                li0VarM13716u = new li0(new zp4(0, 0, objArrCopyOf2, null), 0);
                                break;
                            }
                            li0VarM13716u = null;
                            break;
                        }
                    }
                } else {
                    li0VarM13716u = new li0(new zp4(0, 0, ev0.m5357g0(zp4VarM13714s.f36256d, 0, obj, obj2), null), 1);
                    break;
                }
            } else {
                li0VarM13716u = zp4VarM13714s.m13716u(i, i2 + 5, obj, obj2);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public final zp4 m13717v(int i, int i2, Object obj) {
        zp4 zp4VarM13717v;
        int iM5356f0 = 1 << ev0.m5356f0(i, i2);
        if (m13704h(iM5356f0)) {
            int iM13702f = m13702f(iM5356f0);
            if (!z62.m13387o(obj, this.f36256d[iM13702f])) {
                return this;
            }
            Object[] objArr = this.f36256d;
            if (objArr.length != 2) {
                return new zp4(this.f36253a ^ iM5356f0, this.f36254b, ev0.m5368r0(iM13702f, objArr), null);
            }
        } else {
            if (!m13705i(iM5356f0)) {
                return this;
            }
            int iM13715t = m13715t(iM5356f0);
            zp4 zp4VarM13714s = m13714s(iM13715t);
            if (i2 == 30) {
                p52 p52VarM10654Z = sc6.m10654Z(sc6.m10660c0(0, zp4VarM13714s.f36256d.length), 2);
                int i3 = p52VarM10654Z.f27382a;
                int i4 = p52VarM10654Z.f27383b;
                int i5 = p52VarM10654Z.f27384c;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (!z62.m13387o(obj, zp4VarM13714s.f36256d[i3])) {
                            if (i3 == i4) {
                                zp4VarM13717v = zp4VarM13714s;
                                break;
                            }
                            i3 += i5;
                        } else {
                            Object[] objArr2 = zp4VarM13714s.f36256d;
                            if (objArr2.length != 2) {
                                zp4VarM13717v = new zp4(0, 0, ev0.m5368r0(i3, objArr2), null);
                                break;
                            }
                            zp4VarM13717v = null;
                            break;
                        }
                    }
                } else {
                    zp4VarM13717v = zp4VarM13714s;
                    break;
                }
            } else {
                zp4VarM13717v = zp4VarM13714s.m13717v(i, i2 + 5, obj);
            }
            if (zp4VarM13717v != null) {
                return zp4VarM13714s != zp4VarM13717v ? m13718w(iM13715t, iM5356f0, zp4VarM13717v) : this;
            }
            Object[] objArr3 = this.f36256d;
            if (objArr3.length != 1) {
                return new zp4(this.f36253a, this.f36254b ^ iM5356f0, ev0.m5369s0(iM13715t, objArr3), null);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: w */
    public final zp4 m13718w(int i, int i2, zp4 zp4Var) {
        Object[] objArr = zp4Var.f36256d;
        if (objArr.length != 2 || zp4Var.f36254b != 0) {
            Object[] objArr2 = this.f36256d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            objArrCopyOf[i] = zp4Var;
            return new zp4(this.f36253a, this.f36254b, objArrCopyOf, null);
        }
        if (this.f36256d.length == 1) {
            zp4Var.f36253a = this.f36254b;
            return zp4Var;
        }
        int iM13702f = m13702f(i2);
        Object[] objArr3 = this.f36256d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        AbstractC0990oo.m9198S(i + 2, i + 1, objArr3.length, objArrCopyOf2, objArrCopyOf2);
        AbstractC0990oo.m9198S(iM13702f + 2, iM13702f, i, objArrCopyOf2, objArrCopyOf2);
        objArrCopyOf2[iM13702f] = obj;
        objArrCopyOf2[iM13702f + 1] = obj2;
        return new zp4(this.f36253a ^ i2, this.f36254b ^ i2, objArrCopyOf2, null);
    }

    /* JADX INFO: renamed from: x */
    public final Object m13719x(int i) {
        return this.f36256d[i + 1];
    }
}
