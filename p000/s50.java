package p000;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class s50 implements Serializable, Comparable {

    /* JADX INFO: renamed from: d */
    public static final s50 f29911d = new s50(new byte[0]);

    /* JADX INFO: renamed from: a */
    public final byte[] f29912a;

    /* JADX INFO: renamed from: b */
    public transient int f29913b;

    /* JADX INFO: renamed from: c */
    public transient String f29914c;

    public s50(byte[] bArr) {
        this.f29912a = bArr;
    }

    /* JADX INFO: renamed from: e */
    public static int m10520e(s50 s50Var, s50 s50Var2) {
        s50Var.getClass();
        return s50Var.mo4263d(0, s50Var2.mo4264f());
    }

    /* JADX INFO: renamed from: i */
    public static int m10521i(s50 s50Var, s50 s50Var2) {
        int iMo4261b = s50Var.mo4261b();
        s50Var.getClass();
        return s50Var.mo4266h(iMo4261b, s50Var2.mo4264f());
    }

    /* JADX INFO: renamed from: m */
    public static s50 m10522m(s50 s50Var, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = s50Var.mo4261b();
        }
        return s50Var.mo4269l(i, i2);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(s50 s50Var) {
        int iMo4261b = mo4261b();
        int iMo4261b2 = s50Var.mo4261b();
        int iMin = Math.min(iMo4261b, iMo4261b2);
        for (int i = 0; i < iMin; i++) {
            int iMo4265g = mo4265g(i) & 255;
            int iMo4265g2 = s50Var.mo4265g(i) & 255;
            if (iMo4265g != iMo4265g2) {
                return iMo4265g < iMo4265g2 ? -1 : 1;
            }
        }
        if (iMo4261b == iMo4261b2) {
            return 0;
        }
        return iMo4261b < iMo4261b2 ? -1 : 1;
    }

    /* JADX INFO: renamed from: b */
    public int mo4261b() {
        return this.f29912a.length;
    }

    /* JADX INFO: renamed from: c */
    public String mo4262c() {
        byte[] bArr = this.f29912a;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = AbstractC0647fd.f18911a;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: d */
    public int mo4263d(int i, byte[] bArr) {
        byte[] bArr2 = this.f29912a;
        int length = bArr2.length - bArr.length;
        int iMax = Math.max(i, 0);
        if (iMax > length) {
            return -1;
        }
        while (!dt0.m4714p(bArr2, iMax, bArr, 0, bArr.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s50) {
            s50 s50Var = (s50) obj;
            int iMo4261b = s50Var.mo4261b();
            byte[] bArr = this.f29912a;
            if (iMo4261b == bArr.length && s50Var.mo4267j(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public byte[] mo4264f() {
        return this.f29912a;
    }

    /* JADX INFO: renamed from: g */
    public byte mo4265g(int i) {
        return this.f29912a[i];
    }

    /* JADX INFO: renamed from: h */
    public int mo4266h(int i, byte[] bArr) {
        byte[] bArr2 = this.f29912a;
        for (int iMin = Math.min(i, bArr2.length - bArr.length); -1 < iMin; iMin--) {
            if (dt0.m4714p(bArr2, iMin, bArr, 0, bArr.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public int hashCode() {
        int i = this.f29913b;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f29912a);
        this.f29913b = iHashCode;
        return iHashCode;
    }

    /* JADX INFO: renamed from: j */
    public boolean mo4267j(int i, int i2, int i3, byte[] bArr) {
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.f29912a;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && dt0.m4714p(bArr2, i, bArr, i2, i3);
    }

    /* JADX INFO: renamed from: k */
    public boolean mo4268k(int i, s50 s50Var, int i2) {
        return s50Var.mo4267j(0, i, i2, this.f29912a);
    }

    /* JADX INFO: renamed from: l */
    public s50 mo4269l(int i, int i2) {
        if (i < 0) {
            C1077qn.m9987m("beginIndex < 0");
            return null;
        }
        byte[] bArr = this.f29912a;
        if (i2 > bArr.length) {
            C1077qn.m9984h(bArr.length, "endIndex > length(", 41);
            return null;
        }
        if (i2 - i < 0) {
            C1077qn.m9987m("endIndex < beginIndex");
            return null;
        }
        if (i == 0 && i2 == bArr.length) {
            return this;
        }
        zt5.m13785p(i2, bArr.length);
        return new s50(Arrays.copyOfRange(bArr, i, i2));
    }

    /* JADX INFO: renamed from: n */
    public s50 mo4270n() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f29912a;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                bArrCopyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
                    byte b2 = bArrCopyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArrCopyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new s50(bArrCopyOf);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: o */
    public final String m10524o() {
        String str = this.f29914c;
        if (str != null) {
            return str;
        }
        String str2 = new String(mo4264f(), z80.f35863a);
        this.f29914c = str2;
        return str2;
    }

    /* JADX INFO: renamed from: p */
    public void mo4271p(w30 w30Var, int i) {
        w30Var.m12051L(i, this.f29912a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003f A[EDGE_INSN: B:23:0x003f->B:178:0x01ad BREAK  A[LOOP:0: B:7:0x000e->B:239:0x000e]] */
    public String toString() {
        byte b;
        int i;
        s50 s50Var = this;
        byte[] bArr = s50Var.f29912a;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        loop0: while (i2 < length) {
            byte b2 = bArr[i2];
            if (b2 < 0) {
                if ((b2 >> 5) != -2) {
                    if ((b2 >> 4) != -2) {
                        if ((b2 >> 3) != -2) {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                        int i5 = i2 + 3;
                        if (length > i5) {
                            byte b3 = bArr[i2 + 1];
                            if ((b3 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            byte b4 = bArr[i2 + 2];
                            if ((b4 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            byte b5 = bArr[i5];
                            if ((b5 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            int i6 = (((b5 ^ 3678080) ^ (b4 << 6)) ^ (b3 << 12)) ^ (b2 << 18);
                            if (i6 <= 1114111) {
                                if (55296 <= i6 && i6 < 57344) {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i3 = -1;
                                    break;
                                }
                                if (i6 >= 65536) {
                                    i = i4 + 1;
                                    if (i4 == 64) {
                                        break;
                                    }
                                    if ((i6 != 10 && i6 != 13 && ((i6 >= 0 && i6 < 32) || (127 <= i6 && i6 < 160))) || i6 == 65533) {
                                        i3 = -1;
                                        break;
                                    }
                                    i3 += i6 < 65536 ? 1 : 2;
                                    i2 += 4;
                                    i4 = i;
                                } else {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i3 = -1;
                                    break;
                                }
                            } else {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                        } else {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                    } else {
                        int i7 = i2 + 2;
                        if (length > i7) {
                            byte b6 = bArr[i2 + 1];
                            if ((b6 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            byte b7 = bArr[i7];
                            if ((b7 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            int i8 = ((b7 ^ (-123008)) ^ (b6 << 6)) ^ (b2 << 12);
                            if (i8 >= 2048) {
                                if (55296 <= i8 && i8 < 57344) {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i3 = -1;
                                    break;
                                }
                                i = i4 + 1;
                                if (i4 == 64) {
                                    break;
                                }
                                if ((i8 != 10 && i8 != 13 && ((i8 >= 0 && i8 < 32) || (127 <= i8 && i8 < 160))) || i8 == 65533) {
                                    i3 = -1;
                                    break;
                                }
                                i3 += i8 < 65536 ? 1 : 2;
                                i2 += 3;
                                i4 = i;
                            } else {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                        } else {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                    }
                } else {
                    int i9 = i2 + 1;
                    if (length > i9) {
                        byte b8 = bArr[i9];
                        if ((b8 & 192) != 128) {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                        int i10 = (b8 ^ 3968) ^ (b2 << 6);
                        if (i10 >= 128) {
                            i = i4 + 1;
                            if (i4 == 64) {
                                break;
                            }
                            if ((i10 != 10 && i10 != 13 && ((i10 >= 0 && i10 < 32) || (127 <= i10 && i10 < 160))) || i10 == 65533) {
                                i3 = -1;
                                break;
                            }
                            i3 += i10 < 65536 ? 1 : 2;
                            i2 += 2;
                            i4 = i;
                        } else {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                    } else {
                        if (i4 == 64) {
                            break;
                        }
                        i3 = -1;
                        break;
                    }
                }
            } else {
                int i11 = i4 + 1;
                if (i4 == 64) {
                    break;
                }
                if ((b2 == 10 || b2 == 13 || ((b2 < 0 || b2 >= 32) && (127 > b2 || b2 >= 160))) && b2 != 65533) {
                    i3 += b2 < 65536 ? 1 : 2;
                    i2++;
                    while (true) {
                        i4 = i11;
                        if (i2 < length && (b = bArr[i2]) >= 0) {
                            i2++;
                            i11 = i4 + 1;
                            if (i4 == 64) {
                                break loop0;
                            }
                            if ((b == 10 || b == 13 || ((b < 0 || b >= 32) && (127 > b || b >= 160))) && b != 65533) {
                                i3 += b < 65536 ? 1 : 2;
                            }
                        }
                    }
                }
                i3 = -1;
                break;
            }
        }
        if (i3 != -1) {
            String strM10524o = s50Var.m10524o();
            String strM9042W = od4.m9042W(od4.m9042W(od4.m9042W(strM10524o.substring(0, i3), "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i3 >= strM10524o.length()) {
                return zi4.m13617q(']', "[text=", strM9042W);
            }
            return "[size=" + bArr.length + " text=" + strM9042W + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + s50Var.mo4262c() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        if (64 > bArr.length) {
            C1077qn.m9984h(bArr.length, "endIndex > length(", 41);
            return null;
        }
        if (64 != bArr.length) {
            zt5.m13785p(64, bArr.length);
            s50Var = new s50(Arrays.copyOfRange(bArr, 0, 64));
        }
        sb.append(s50Var.mo4262c());
        sb.append("…]");
        return sb.toString();
    }
}
