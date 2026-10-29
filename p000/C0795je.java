package p000;

import ads_mobile_sdk.da4;
import ads_mobile_sdk.qa4;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: je */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0795je implements af5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f22192a;

    /* JADX INFO: renamed from: b */
    public int f22193b;

    /* JADX INFO: renamed from: c */
    public Object f22194c;

    /* JADX INFO: renamed from: d */
    public Object f22195d;

    public C0795je(qa4 qa4Var) {
        this.f22192a = (byte) 8;
        this.f22193b = y70.m13024d(1639930109, -1705198021, 164110942, 67728125) ^ 161650728;
        this.f22194c = new byte[8];
        this.f22195d = qa4Var;
    }

    @Override // p000.af5
    /* JADX INFO: renamed from: a */
    public byte mo2970a(da4 da4Var, int i) {
        byte[] bArr = (byte[]) this.f22194c;
        int iM13024d = i >>> (y70.m13024d(993115750, 1213092095, -122082883, 1967905751) ^ 1229180);
        if (iM13024d != this.f22193b) {
            ((qa4) this.f22195d).m2029a(iM13024d, bArr);
            this.f22193b = iM13024d;
        }
        return (byte) (((da4Var.m672a(i) ^ bArr[i % 8]) << 24) >> 24);
    }

    /* JADX INFO: renamed from: b */
    public void m7077b(int i, jp0 jp0Var) {
        if (i < 0) {
            t32.m10968a("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.f22193b;
        r62 r62Var = new r62();
        r62Var.f29056a = i2;
        r62Var.f29057b = i;
        r62Var.f29058c = jp0Var;
        if (i2 < 0) {
            t32.m10968a("startIndex should be >= 0");
        }
        if (i <= 0) {
            t32.m10968a("size should be > 0");
        }
        VarHandle.storeStoreFence();
        this.f22193b += i;
        ((uw2) this.f22194c).m11663b(r62Var);
    }

    /* JADX INFO: renamed from: c */
    public jm3 m7078c() {
        v12 v12Var = (v12) this.f22195d;
        if (v12Var != null) {
            throw v12Var.m11694a();
        }
        jm3 jm3VarM7185a = jm3.m7185a(this.f22193b, (Object[]) this.f22194c, this);
        v12 v12Var2 = (v12) this.f22195d;
        if (v12Var2 == null) {
            return jm3VarM7185a;
        }
        throw v12Var2.m11694a();
    }

    /* JADX INFO: renamed from: d */
    public r62 m7079d(int i) {
        if (i < 0 || i >= this.f22193b) {
            t32.m10972e("Index " + i + ", size " + this.f22193b);
        }
        r62 r62Var = (r62) this.f22195d;
        if (r62Var != null) {
            int i2 = r62Var.f29056a;
            if (i < r62Var.f29057b + i2 && i2 <= i) {
                return r62Var;
            }
        }
        uw2 uw2Var = (uw2) this.f22194c;
        r62 r62Var2 = (r62) uw2Var.f32211a[i25.m6616h(i, uw2Var)];
        this.f22195d = r62Var2;
        return r62Var2;
    }

    /* JADX INFO: renamed from: e */
    public int m7080e(Object obj) {
        yv2 yv2Var = (yv2) this.f22194c;
        int iM13260d = yv2Var.m13260d(obj);
        if (iM13260d >= 0) {
            return yv2Var.f35549c[iM13260d];
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public int m7081f(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2, boolean z3) {
        int i8 = i & 33554431;
        long[] jArr = (long[]) this.f22194c;
        int i9 = this.f22193b;
        int i10 = i9 + 3;
        this.f22193b = i10;
        int length = jArr.length;
        if (length <= i10) {
            int iMax = Math.max(length * 2, i10);
            this.f22194c = Arrays.copyOf(jArr, iMax);
            this.f22195d = Arrays.copyOf((long[]) this.f22195d, iMax);
        }
        long[] jArr2 = (long[]) this.f22194c;
        jArr2[i9] = (((long) i2) << 32) | (((long) i3) & 4294967295L);
        jArr2[i9 + 1] = (((long) i4) << 32) | (((long) i5) & 4294967295L);
        int i11 = i6 & 33554431;
        jArr2[i9 + 2] = ((z3 ? 1L : 0L) << 63) | ((z2 ? 1L : 0L) << 62) | ((z ? 1L : 0L) << 61) | 1152921504606846976L | (((long) Math.min(0, 1023)) << 50) | (((long) i11) << 25) | ((long) (i & 33554431));
        if (i6 == -1) {
            return i9;
        }
        if ((i7 != -4) == false) {
            q32.m9721c("Inserted child " + i8 + " without valid parent index");
        }
        int i12 = i7 + 2;
        long j = jArr2[i12];
        if (!((33554431 & ((int) j)) == i11)) {
            q32.m9721c("Inserted child " + i8 + " without valid parent index or parent " + i11 + " not found");
        }
        int i13 = kl3.f23215b;
        jArr2[i12] = ((-1151795604700004353L) & j) | (((long) Math.min((i9 - i7) / 3, 1023)) << 50);
        return i9;
    }

    /* JADX INFO: renamed from: g */
    public void m7082g(Object obj, Object obj2) {
        int i = (this.f22193b + 1) * 2;
        Object[] objArr = (Object[]) this.f22194c;
        if (i > objArr.length) {
            this.f22194c = Arrays.copyOf(objArr, q12.m9697b(objArr.length, i));
        }
        y70.m13034n(obj, obj2);
        Object[] objArr2 = (Object[]) this.f22194c;
        int i2 = this.f22193b;
        int i3 = i2 * 2;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.f22193b = i2 + 1;
    }

    /* JADX INFO: renamed from: h */
    public void m7083h(Collection collection) {
        if (collection instanceof Collection) {
            int size = (collection.size() + this.f22193b) * 2;
            Object[] objArr = (Object[]) this.f22194c;
            if (size > objArr.length) {
                this.f22194c = Arrays.copyOf(objArr, q12.m9697b(objArr.length, size));
            }
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            m7082g(entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: renamed from: i */
    public void m7084i(int i, int i2, int i3, long j) {
        long j2;
        char c;
        int i4;
        char c2 = '2';
        if ((((int) (j >> 50)) & 1023) > 0) {
            int i5 = kl3.f23215b;
            long j3 = -1125899873288193L;
            int i6 = 33554431;
            char c3 = 25;
            long[] jArr = (long[]) this.f22194c;
            long[] jArr2 = (long[]) this.f22195d;
            int i7 = this.f22193b;
            jArr2[0] = (j & (-1125899873288193L)) | (((long) (i & 33554431)) << 25);
            int i8 = 1;
            while (i8 > 0) {
                i8--;
                long j4 = jArr2[i8];
                int i9 = ((int) j4) & i6;
                int i10 = ((int) (j4 >> c3)) & i6;
                int i11 = ((int) (j4 >> c2)) & 1023;
                int i12 = i11 == 1023 ? i7 : (i11 * 3) + i10;
                if (i10 < 0) {
                    return;
                }
                while (i10 < i7 - 2 && i10 <= i12) {
                    int i13 = i10 + 2;
                    long j5 = jArr[i13];
                    char c4 = c2;
                    int i14 = i6;
                    if ((((int) (j5 >> c3)) & i14) == i9) {
                        long j6 = jArr[i10];
                        int i15 = i10 + 1;
                        j2 = j3;
                        long j7 = jArr[i15];
                        c = c3;
                        i4 = i12;
                        jArr[i10] = (((long) (((int) j6) + i3)) & 4294967295L) | (((long) (((int) (j6 >> 32)) + i2)) << 32);
                        jArr[i15] = (((long) (((int) j7) + i3)) & 4294967295L) | (((long) (((int) (j7 >> 32)) + i2)) << 32);
                        jArr[i13] = (((j5 >> 63) & 1) << 60) | j5;
                        if ((((int) (j5 >> c4)) & 1023) > 0) {
                            int i16 = kl3.f23215b;
                            jArr2[i8] = (j5 & j2) | (((long) ((i10 + 3) & i14)) << c);
                            i8++;
                        }
                    } else {
                        j2 = j3;
                        c = c3;
                        i4 = i12;
                    }
                    i10 += 3;
                    i12 = i4;
                    c3 = c;
                    i6 = i14;
                    c2 = c4;
                    j3 = j2;
                }
                c3 = c3;
                i6 = i6;
                c2 = c2;
                j3 = j3;
            }
        }
    }

    public String toString() {
        switch (this.f22192a) {
            case 7:
                StringBuilder sb = new StringBuilder();
                if (((wh3) this.f22194c) == wh3.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.f22193b);
                sb.append(' ');
                sb.append((String) this.f22195d);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public C0795je(int i, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f22192a = (byte) 10;
        this.f22193b = i;
        this.f22195d = str;
        this.f22194c = arrayList;
    }

    public /* synthetic */ C0795je(byte b) {
        this.f22192a = b;
    }

    public C0795je(int i) {
        this.f22192a = (byte) 2;
        this.f22194c = new Object[i * 2];
        this.f22193b = 0;
    }

    @Override // p000.af5
    /* JADX INFO: renamed from: a */
    public da4 mo2971a(da4 da4Var, int i, int i2) {
        byte[] bArr;
        if (i >= 0 && i <= i2 && i2 <= da4Var.f2451a.length) {
            int i3 = i2 - i;
            byte[] bArr2 = new byte[i3];
            int i4 = 0;
            while (i < i2) {
                bArr2[i4] = mo2970a(da4Var, i);
                i++;
                i4++;
            }
            if (i3 == 0) {
                bArr = new byte[0];
            } else {
                bArr = new byte[i3];
                System.arraycopy(bArr2, 0, bArr, 0, i3);
            }
            return new da4(bArr);
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // p000.af5
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ af5 mo2972a() {
        return new C0795je((qa4) this.f22195d);
    }
}
