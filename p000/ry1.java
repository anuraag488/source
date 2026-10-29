package p000;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ry1 implements Closeable {

    /* JADX INFO: renamed from: d */
    public static final Logger f29727d = Logger.getLogger(gy1.class.getName());

    /* JADX INFO: renamed from: a */
    public ak3 f29728a;

    /* JADX INFO: renamed from: b */
    public qy1 f29729b;

    /* JADX INFO: renamed from: c */
    public tx1 f29730c;

    /* JADX INFO: renamed from: a */
    public final boolean m10498a(boolean z, C0839kl c0839kl) throws IOException {
        int i;
        boolean z2;
        int i2;
        Object[] array;
        boolean z3 = false;
        try {
            this.f29728a.m3034q(9L);
            int iM13823r = zv4.m13823r(this.f29728a);
            if (iM13823r > 16384) {
                wb1.m12191j(c75.m3877i(iM13823r, "FRAME_SIZE_ERROR: "));
                return false;
            }
            int iM3026e = this.f29728a.m3026e() & 255;
            byte bM3026e = this.f29728a.m3026e();
            int i3 = bM3026e & 255;
            int iM3029j = this.f29728a.m3029j();
            int i4 = Integer.MAX_VALUE & iM3029j;
            Logger logger = f29727d;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(gy1.m6195a(true, i4, iM13823r, iM3026e, i3));
            }
            if (z && iM3026e != 4) {
                StringBuilder sb = new StringBuilder("Expected a SETTINGS frame but was ");
                String[] strArr = gy1.f20184b;
                sb.append(iM3026e < strArr.length ? strArr[iM3026e] : zv4.m13812g("0x%02x", Integer.valueOf(iM3026e)));
                throw new IOException(sb.toString());
            }
            byte b = 2;
            switch (iM3026e) {
                case 0:
                    m10499b(c0839kl, iM13823r, i3, i4);
                    return true;
                case 1:
                    m10501g(c0839kl, iM13823r, i3, i4);
                    return true;
                case 2:
                    if (iM13823r != 5) {
                        wb1.m12191j(c75.m3878j("TYPE_PRIORITY length: ", iM13823r, " != 5"));
                        return false;
                    }
                    if (i4 == 0) {
                        wb1.m12191j("TYPE_PRIORITY streamId == 0");
                        return false;
                    }
                    ak3 ak3Var = this.f29728a;
                    ak3Var.m3029j();
                    ak3Var.m3026e();
                    return true;
                case 3:
                    if (iM13823r != 4) {
                        wb1.m12191j(c75.m3878j("TYPE_RST_STREAM length: ", iM13823r, " != 4"));
                        return false;
                    }
                    if (i4 == 0) {
                        wb1.m12191j("TYPE_RST_STREAM streamId == 0");
                        return false;
                    }
                    int iM3029j2 = this.f29728a.m3029j();
                    int[] iArrM4378w = d55.m4378w(14);
                    int length = iArrM4378w.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 < length) {
                            i = iArrM4378w[i5];
                            if (d55.m4359d(i) != iM3029j2) {
                                i5++;
                            }
                        } else {
                            i = 0;
                        }
                    }
                    if (i == 0) {
                        wb1.m12191j(c75.m3877i(iM3029j2, "TYPE_RST_STREAM unexpected error code: "));
                        return false;
                    }
                    oy1 oy1Var = (oy1) c0839kl.f23209c;
                    if (i4 != 0 && (iM3029j & 1) == 0) {
                        oy1Var.f27215i.m9124c(new ly1(oy1Var.f27209c + '[' + i4 + "] onReset", oy1Var, i4, i), 0L);
                        return true;
                    }
                    vy1 vy1VarM9330e = oy1Var.m9330e(i4);
                    if (vy1VarM9330e != null) {
                        synchronized (vy1VarM9330e) {
                            if (vy1VarM9330e.f32944m == 0) {
                                vy1VarM9330e.f32944m = i;
                                vy1VarM9330e.notifyAll();
                            }
                            break;
                        }
                        return true;
                    }
                    return true;
                case 4:
                    ak3 ak3Var2 = this.f29728a;
                    if (i4 != 0) {
                        wb1.m12191j("TYPE_SETTINGS streamId != 0");
                        return false;
                    }
                    if ((bM3026e & 1) != 0) {
                        if (iM13823r != 0) {
                            wb1.m12191j("FRAME_SIZE_ERROR ack frame should be empty!");
                            return false;
                        }
                        return true;
                    }
                    if (iM13823r % 6 != 0) {
                        wb1.m12191j(c75.m3877i(iM13823r, "TYPE_SETTINGS length % 6 != 0: "));
                        return false;
                    }
                    b44 b44Var = new b44();
                    p52 p52VarM10654Z = sc6.m10654Z(sc6.m10660c0(0, iM13823r), 6);
                    int i6 = p52VarM10654Z.f27382a;
                    int i7 = p52VarM10654Z.f27383b;
                    int i8 = p52VarM10654Z.f27384c;
                    if ((i8 > 0 && i6 <= i7) || (i8 < 0 && i7 <= i6)) {
                        while (true) {
                            short sM3031l = ak3Var2.m3031l();
                            byte[] bArr = zv4.f36415a;
                            int i9 = sM3031l & 65535;
                            int iM3029j3 = ak3Var2.m3029j();
                            if (i9 == 2) {
                                z2 = z3;
                                if (iM3029j3 != 0 && iM3029j3 != 1) {
                                    wb1.m12191j("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                    return z2;
                                }
                            } else if (i9 == 3) {
                                z2 = z3;
                                i9 = 4;
                            } else if (i9 == 4) {
                                z2 = z3;
                                if (iM3029j3 < 0) {
                                    wb1.m12191j("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                    return z2;
                                }
                                i9 = 7;
                            } else if (i9 != 5) {
                                z2 = z3;
                            } else {
                                z2 = z3;
                                if (iM3029j3 < 16384 || iM3029j3 > 16777215) {
                                    wb1.m12191j(c75.m3877i(iM3029j3, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                                    return z2;
                                }
                            }
                            b44Var.m3434b(i9, iM3029j3);
                            if (i6 != i7) {
                                i6 += i8;
                                z3 = z2;
                            }
                        }
                    }
                    oy1 oy1Var2 = (oy1) c0839kl.f23209c;
                    oy1Var2.f27214h.m9124c(new iy1(zi4.m13623w(new StringBuilder(), oy1Var2.f27209c, " applyAndAckSettings"), c0839kl, b44Var, b), 0L);
                    return true;
                case 5:
                    m10502j(c0839kl, iM13823r, i3, i4);
                    return true;
                case 6:
                    if (iM13823r != 8) {
                        wb1.m12191j(c75.m3877i(iM13823r, "TYPE_PING length != 8: "));
                        return false;
                    }
                    if (i4 != 0) {
                        wb1.m12191j("TYPE_PING streamId != 0");
                        return false;
                    }
                    int iM3029j4 = this.f29728a.m3029j();
                    int iM3029j5 = this.f29728a.m3029j();
                    byte b2 = (bM3026e & 1) != 0 ? (byte) 1 : (byte) 0;
                    oy1 oy1Var3 = (oy1) c0839kl.f23209c;
                    if (b2 == 0) {
                        oy1Var3.f27214h.m9124c(new jy1(zi4.m13623w(new StringBuilder(), ((oy1) c0839kl.f23209c).f27209c, " ping"), (oy1) c0839kl.f23209c, iM3029j4, iM3029j5, (byte) 0), 0L);
                        return true;
                    }
                    synchronized (oy1Var3) {
                        try {
                            if (iM3029j4 == 1) {
                                oy1Var3.f27218l++;
                            } else if (iM3029j4 == 2) {
                                oy1Var3.f27220n++;
                            } else if (iM3029j4 == 3) {
                                oy1Var3.notifyAll();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return true;
                case 7:
                    if (iM13823r < 8) {
                        wb1.m12191j(c75.m3877i(iM13823r, "TYPE_GOAWAY length < 8: "));
                        return false;
                    }
                    if (i4 != 0) {
                        wb1.m12191j("TYPE_GOAWAY streamId != 0");
                        return false;
                    }
                    int iM3029j6 = this.f29728a.m3029j();
                    int iM3029j7 = this.f29728a.m3029j();
                    int i10 = iM13823r - 8;
                    int[] iArrM4378w2 = d55.m4378w(14);
                    int length2 = iArrM4378w2.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 < length2) {
                            i2 = iArrM4378w2[i11];
                            if (d55.m4359d(i2) != iM3029j7) {
                                i11++;
                            }
                        } else {
                            i2 = 0;
                        }
                    }
                    if (i2 == 0) {
                        wb1.m12191j(c75.m3877i(iM3029j7, "TYPE_GOAWAY unexpected error code: "));
                        return false;
                    }
                    s50 s50VarM3027g = s50.f29911d;
                    if (i10 > 0) {
                        s50VarM3027g = this.f29728a.m3027g(i10);
                    }
                    s50VarM3027g.mo4261b();
                    oy1 oy1Var4 = (oy1) c0839kl.f23209c;
                    synchronized (oy1Var4) {
                        array = oy1Var4.f27208b.values().toArray(new vy1[0]);
                        oy1Var4.f27212f = true;
                    }
                    for (vy1 vy1Var : (vy1[]) array) {
                        if (vy1Var.f32932a > iM3029j6 && vy1Var.m12025g()) {
                            synchronized (vy1Var) {
                                if (vy1Var.f32944m == 0) {
                                    vy1Var.f32944m = 8;
                                    vy1Var.notifyAll();
                                }
                                break;
                            }
                            ((oy1) c0839kl.f23209c).m9330e(vy1Var.f32932a);
                        }
                    }
                    return true;
                case 8:
                    if (iM13823r != 4) {
                        wb1.m12191j(c75.m3877i(iM13823r, "TYPE_WINDOW_UPDATE length !=4: "));
                        return false;
                    }
                    long jM3029j = 2147483647L & ((long) this.f29728a.m3029j());
                    if (jM3029j == 0) {
                        wb1.m12191j("windowSizeIncrement was 0");
                        return false;
                    }
                    oy1 oy1Var5 = (oy1) c0839kl.f23209c;
                    if (i4 == 0) {
                        synchronized (oy1Var5) {
                            oy1Var5.f27227u += jM3029j;
                            oy1Var5.notifyAll();
                        }
                        return true;
                    }
                    vy1 vy1VarM9329b = oy1Var5.m9329b(i4);
                    if (vy1VarM9329b != null) {
                        synchronized (vy1VarM9329b) {
                            vy1VarM9329b.f32937f += jM3029j;
                            if (jM3029j > 0) {
                                vy1VarM9329b.notifyAll();
                            }
                            break;
                        }
                        return true;
                    }
                    return true;
                default:
                    this.f29728a.m3037t(iM13823r);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m10499b(C0839kl c0839kl, int i, int i2, int i3) throws IOException {
        int i4;
        boolean z;
        boolean z2;
        if (i3 == 0) {
            wb1.m12191j("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
            return;
        }
        boolean z3 = (i2 & 1) != 0;
        if ((i2 & 32) != 0) {
            wb1.m12191j("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
            return;
        }
        if ((i2 & 8) != 0) {
            byte bM3026e = this.f29728a.m3026e();
            byte[] bArr = zv4.f36415a;
            i4 = bM3026e & 255;
        } else {
            i4 = 0;
        }
        int iM13012M = y70.m13012M(i, i2, i4);
        ak3 ak3Var = this.f29728a;
        oy1 oy1Var = (oy1) c0839kl.f23209c;
        if (i3 != 0 && (i3 & 1) == 0) {
            w30 w30Var = new w30();
            long j = iM13012M;
            ak3Var.m3034q(j);
            ak3Var.mo3038w(w30Var, j);
            oy1Var.f27215i.m9124c(new ky1(oy1Var.f27209c + '[' + i3 + "] onData", oy1Var, i3, w30Var, iM13012M, z3), 0L);
        } else {
            vy1 vy1VarM9329b = oy1Var.m9329b(i3);
            if (vy1VarM9329b == null) {
                ((oy1) c0839kl.f23209c).m9334l(i3, 2);
                long j2 = iM13012M;
                ((oy1) c0839kl.f23209c).m9332j(j2);
                ak3Var.m3037t(j2);
            } else {
                byte[] bArr2 = zv4.f36415a;
                ty1 ty1Var = vy1VarM9329b.f32940i;
                long j3 = iM13012M;
                ty1Var.getClass();
                long j4 = j3;
                while (true) {
                    vy1 vy1Var = ty1Var.f31532f;
                    if (j4 <= 0) {
                        byte[] bArr3 = zv4.f36415a;
                        vy1Var.f32933b.m9332j(j3);
                        break;
                    }
                    synchronized (vy1Var) {
                        z = ty1Var.f31528b;
                        z2 = ty1Var.f31530d.f33056b + j4 > ty1Var.f31527a;
                    }
                    if (z2) {
                        ak3Var.m3037t(j4);
                        ty1Var.f31532f.m12023e(4);
                        break;
                    }
                    if (z) {
                        ak3Var.m3037t(j4);
                        break;
                    }
                    long jMo3038w = ak3Var.mo3038w(ty1Var.f31529c, j4);
                    if (jMo3038w == -1) {
                        throw new EOFException();
                    }
                    j4 -= jMo3038w;
                    vy1 vy1Var2 = ty1Var.f31532f;
                    synchronized (vy1Var2) {
                        try {
                            if (ty1Var.f31531e) {
                                w30 w30Var2 = ty1Var.f31529c;
                                w30Var2.m12048D(w30Var2.f33056b);
                            } else {
                                w30 w30Var3 = ty1Var.f31530d;
                                boolean z4 = w30Var3.f33056b == 0;
                                w30Var3.m12053N(ty1Var.f31529c);
                                if (z4) {
                                    vy1Var2.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (z3) {
                    vy1VarM9329b.m12027i(zv4.f36416b, true);
                }
            }
        }
        this.f29728a.m3037t(i4);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f29728a.close();
    }

    /* JADX INFO: renamed from: e */
    public final List m10500e(int i, int i2, int i3, int i4) throws IOException {
        qy1 qy1Var = this.f29729b;
        qy1Var.f28879e = i;
        qy1Var.f28876b = i;
        qy1Var.f28880f = i2;
        qy1Var.f28877c = i3;
        qy1Var.f28878d = i4;
        tx1 tx1Var = this.f29730c;
        ak3 ak3Var = tx1Var.f31508c;
        ArrayList arrayList = tx1Var.f31507b;
        while (!ak3Var.m3023a()) {
            byte bM3026e = ak3Var.m3026e();
            byte[] bArr = zv4.f36415a;
            int i5 = bM3026e & 255;
            if (i5 == 128) {
                wb1.m12191j("index == 0");
                return null;
            }
            if ((bM3026e & 128) == 128) {
                int iM11195e = tx1Var.m11195e(i5, 127);
                int i6 = iM11195e - 1;
                if (i6 >= 0) {
                    sv1[] sv1VarArr = vx1.f32905a;
                    if (i6 <= sv1VarArr.length - 1) {
                        arrayList.add(sv1VarArr[i6]);
                    }
                }
                int length = tx1Var.f31510e + 1 + (i6 - vx1.f32905a.length);
                if (length >= 0) {
                    sv1[] sv1VarArr2 = tx1Var.f31509d;
                    if (length < sv1VarArr2.length) {
                        arrayList.add(sv1VarArr2[length]);
                    }
                }
                wb1.m12191j(c75.m3877i(iM11195e, "Header index too large "));
                return null;
            }
            if (i5 == 64) {
                sv1[] sv1VarArr3 = vx1.f32905a;
                s50 s50VarM11194d = tx1Var.m11194d();
                vx1.m12015a(s50VarM11194d);
                tx1Var.m11193c(new sv1(s50VarM11194d, tx1Var.m11194d()));
            } else if ((bM3026e & 64) == 64) {
                tx1Var.m11193c(new sv1(tx1Var.m11192b(tx1Var.m11195e(i5, 63) - 1), tx1Var.m11194d()));
            } else if ((bM3026e & 32) == 32) {
                int iM11195e2 = tx1Var.m11195e(i5, 31);
                tx1Var.f31506a = iM11195e2;
                if (iM11195e2 < 0 || iM11195e2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + tx1Var.f31506a);
                }
                int i7 = tx1Var.f31512g;
                if (iM11195e2 < i7) {
                    if (iM11195e2 == 0) {
                        AbstractC0990oo.m9206a0(null, tx1Var.f31509d);
                        tx1Var.f31510e = tx1Var.f31509d.length - 1;
                        tx1Var.f31511f = 0;
                        tx1Var.f31512g = 0;
                    } else {
                        tx1Var.m11191a(i7 - iM11195e2);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                sv1[] sv1VarArr4 = vx1.f32905a;
                s50 s50VarM11194d2 = tx1Var.m11194d();
                vx1.m12015a(s50VarM11194d2);
                arrayList.add(new sv1(s50VarM11194d2, tx1Var.m11194d()));
            } else {
                arrayList.add(new sv1(tx1Var.m11192b(tx1Var.m11195e(i5, 15) - 1), tx1Var.m11194d()));
            }
        }
        List listM6319e1 = hb0.m6319e1(arrayList);
        arrayList.clear();
        return listM6319e1;
    }

    /* JADX INFO: renamed from: g */
    public final void m10501g(C0839kl c0839kl, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            wb1.m12191j("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
            return;
        }
        boolean z = false;
        byte b = 1;
        boolean z2 = (i2 & 1) != 0;
        if ((i2 & 8) != 0) {
            byte bM3026e = this.f29728a.m3026e();
            byte[] bArr = zv4.f36415a;
            i4 = bM3026e & 255;
        } else {
            i4 = 0;
        }
        if ((i2 & 32) != 0) {
            ak3 ak3Var = this.f29728a;
            ak3Var.m3029j();
            ak3Var.m3026e();
            byte[] bArr2 = zv4.f36415a;
            i -= 5;
        }
        List listM10500e = m10500e(y70.m13012M(i, i2, i4), i4, i2, i3);
        oy1 oy1Var = (oy1) c0839kl.f23209c;
        if (i3 != 0 && (i3 & 1) == 0) {
            z = true;
        }
        if (z) {
            oy1Var.f27215i.m9124c(new ly1(oy1Var.f27209c + '[' + i3 + "] onHeaders", oy1Var, i3, listM10500e, z2), 0L);
            return;
        }
        synchronized (oy1Var) {
            vy1 vy1VarM9329b = oy1Var.m9329b(i3);
            if (vy1VarM9329b != null) {
                vy1VarM9329b.m12027i(zv4.m13825t(listM10500e), z2);
                return;
            }
            if (oy1Var.f27212f) {
                return;
            }
            if (i3 <= oy1Var.f27210d) {
                return;
            }
            if (i3 % 2 == oy1Var.f27211e % 2) {
                return;
            }
            vy1 vy1Var = new vy1(i3, oy1Var, false, z2, zv4.m13825t(listM10500e));
            oy1Var.f27210d = i3;
            oy1Var.f27208b.put(Integer.valueOf(i3), vy1Var);
            oy1Var.f27213g.m9535d().m9124c(new iy1(oy1Var.f27209c + '[' + i3 + "] onStream", oy1Var, vy1Var, b), 0L);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m10502j(C0839kl c0839kl, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            wb1.m12191j("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
            return;
        }
        if ((i2 & 8) != 0) {
            byte bM3026e = this.f29728a.m3026e();
            byte[] bArr = zv4.f36415a;
            i4 = bM3026e & 255;
        } else {
            i4 = 0;
        }
        int iM3029j = this.f29728a.m3029j() & Integer.MAX_VALUE;
        List listM10500e = m10500e(y70.m13012M(i - 4, i2, i4), i4, i2, i3);
        oy1 oy1Var = (oy1) c0839kl.f23209c;
        synchronized (oy1Var) {
            if (oy1Var.f27231y.contains(Integer.valueOf(iM3029j))) {
                oy1Var.m9334l(iM3029j, 2);
                return;
            }
            oy1Var.f27231y.add(Integer.valueOf(iM3029j));
            oy1Var.f27215i.m9124c(new ly1(oy1Var.f27209c + '[' + iM3029j + "] onRequest", oy1Var, iM3029j, listM10500e), 0L);
        }
    }
}
