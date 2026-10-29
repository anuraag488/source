package p000;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ac1 {

    /* JADX INFO: renamed from: a */
    public final int f242a;

    /* JADX INFO: renamed from: b */
    public final int f243b;

    /* JADX INFO: renamed from: c */
    public final long f244c;

    /* JADX INFO: renamed from: d */
    public final byte[] f245d;

    public ac1(long j, byte[] bArr, int i, int i2) {
        this.f242a = i;
        this.f243b = i2;
        this.f244c = j;
        this.f245d = bArr;
    }

    /* JADX INFO: renamed from: a */
    public static ac1 m184a(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[ec1.f17962C[4]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putInt((int) jArr[0]);
        return new ac1(byteBufferWrap.array(), 4, 1);
    }

    /* JADX INFO: renamed from: b */
    public static ac1 m185b(cc1 cc1Var, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[ec1.f17962C[5]]);
        byteBufferWrap.order(byteOrder);
        cc1 cc1Var2 = new cc1[]{cc1Var}[0];
        byteBufferWrap.putInt((int) cc1Var2.f15922a);
        byteBufferWrap.putInt((int) cc1Var2.f15923b);
        return new ac1(byteBufferWrap.array(), 5, 1);
    }

    /* JADX INFO: renamed from: c */
    public static ac1 m186c(int i, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[ec1.f17962C[3]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putShort((short) new int[]{i}[0]);
        return new ac1(byteBufferWrap.array(), 3, 1);
    }

    /* JADX INFO: renamed from: d */
    public final double m187d(ByteOrder byteOrder) throws Throwable {
        Object objM190g = m190g(byteOrder);
        if (objM190g == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objM190g instanceof String) {
            return Double.parseDouble((String) objM190g);
        }
        if (objM190g instanceof long[]) {
            long[] jArr = (long[]) objM190g;
            if (jArr.length == 1) {
                return jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM190g instanceof int[]) {
            int[] iArr = (int[]) objM190g;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM190g instanceof double[]) {
            double[] dArr = (double[]) objM190g;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objM190g instanceof cc1[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        cc1[] cc1VarArr = (cc1[]) objM190g;
        if (cc1VarArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        cc1 cc1Var = cc1VarArr[0];
        return cc1Var.f15922a / cc1Var.f15923b;
    }

    /* JADX INFO: renamed from: e */
    public final int m188e(ByteOrder byteOrder) throws Throwable {
        Object objM190g = m190g(byteOrder);
        if (objM190g == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objM190g instanceof String) {
            return Integer.parseInt((String) objM190g);
        }
        if (objM190g instanceof long[]) {
            long[] jArr = (long[]) objM190g;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objM190g instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objM190g;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    /* JADX INFO: renamed from: f */
    public final String m189f(ByteOrder byteOrder) throws Throwable {
        Object objM190g = m190g(byteOrder);
        if (objM190g == null) {
            return null;
        }
        if (objM190g instanceof String) {
            return (String) objM190g;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (objM190g instanceof long[]) {
            long[] jArr = (long[]) objM190g;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objM190g instanceof int[]) {
            int[] iArr = (int[]) objM190g;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objM190g instanceof double[]) {
            double[] dArr = (double[]) objM190g;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(objM190g instanceof cc1[])) {
            return null;
        }
        cc1[] cc1VarArr = (cc1[]) objM190g;
        while (i < cc1VarArr.length) {
            sb.append(cc1VarArr[i].f15922a);
            sb.append('/');
            sb.append(cc1VarArr[i].f15923b);
            i++;
            if (i != cc1VarArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0134 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:51), block:B:17:0x0032 */
    /* JADX WARN: Type inference failed for: r13v14, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v15, types: [long[]] */
    /* JADX WARN: Type inference failed for: r13v16, types: [cc1[]] */
    /* JADX WARN: Type inference failed for: r13v17, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v18, types: [int[]] */
    /* JADX WARN: Type inference failed for: r13v19, types: [cc1[]] */
    /* JADX WARN: Type inference failed for: r13v20, types: [double[]] */
    /* JADX WARN: Type inference failed for: r13v21, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r13v22, types: [double[]] */
    /* JADX INFO: renamed from: g */
    public final Serializable m190g(ByteOrder byteOrder) throws Throwable {
        zb1 zb1Var;
        InputStream inputStream;
        String str;
        byte b;
        ?? r13;
        byte[] bArr = this.f245d;
        InputStream inputStream2 = null;
        try {
            try {
                zb1Var = new zb1(bArr);
                try {
                    zb1Var.f35916c = byteOrder;
                    int i = this.f242a;
                    int length = 0;
                    int i2 = this.f243b;
                    switch (i) {
                        case 1:
                        case 6:
                            if (bArr.length != 1 || (b = bArr[0]) < 0 || b > 1) {
                                str = new String(bArr, ec1.f17971L);
                                try {
                                    zb1Var.close();
                                    return str;
                                } catch (IOException e) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
                                    return str;
                                }
                            }
                            String str2 = new String(new char[]{(char) (b + 48)});
                            try {
                                zb1Var.close();
                                return str2;
                            } catch (IOException e2) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e2);
                                return str2;
                            }
                        case 2:
                        case 7:
                            if (i2 >= ec1.f17963D.length) {
                                int i3 = 0;
                                while (true) {
                                    byte[] bArr2 = ec1.f17963D;
                                    if (i3 >= bArr2.length) {
                                        length = bArr2.length;
                                    } else if (bArr[i3] == bArr2[i3]) {
                                        i3++;
                                    }
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            while (length < i2) {
                                byte b2 = bArr[length];
                                if (b2 == 0) {
                                    str = sb.toString();
                                    zb1Var.close();
                                    return str;
                                }
                                if (b2 >= 32) {
                                    sb.append((char) b2);
                                } else {
                                    sb.append('?');
                                }
                                length++;
                            }
                            str = sb.toString();
                            zb1Var.close();
                            return str;
                        case 3:
                            r13 = new int[i2];
                            while (length < i2) {
                                r13[length] = zb1Var.readUnsignedShort();
                                length++;
                            }
                            try {
                                zb1Var.close();
                                return r13;
                            } catch (IOException e3) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e3);
                                return r13;
                            }
                        case 4:
                            r13 = new long[i2];
                            while (length < i2) {
                                r13[length] = ((long) zb1Var.readInt()) & 4294967295L;
                                length++;
                            }
                            zb1Var.close();
                            return r13;
                        case 5:
                            r13 = new cc1[i2];
                            while (length < i2) {
                                r13[length] = new cc1(((long) zb1Var.readInt()) & 4294967295L, ((long) zb1Var.readInt()) & 4294967295L);
                                length++;
                            }
                            zb1Var.close();
                            return r13;
                        case 8:
                            r13 = new int[i2];
                            while (length < i2) {
                                r13[length] = zb1Var.readShort();
                                length++;
                            }
                            zb1Var.close();
                            return r13;
                        case 9:
                            r13 = new int[i2];
                            while (length < i2) {
                                r13[length] = zb1Var.readInt();
                                length++;
                            }
                            zb1Var.close();
                            return r13;
                        case 10:
                            r13 = new cc1[i2];
                            while (length < i2) {
                                r13[length] = new cc1(zb1Var.readInt(), zb1Var.readInt());
                                length++;
                            }
                            zb1Var.close();
                            return r13;
                        case 11:
                            r13 = new double[i2];
                            while (length < i2) {
                                r13[length] = zb1Var.readFloat();
                                length++;
                            }
                            zb1Var.close();
                            return r13;
                        case 12:
                            r13 = new double[i2];
                            while (length < i2) {
                                r13[length] = zb1Var.readDouble();
                                length++;
                            }
                            zb1Var.close();
                            return r13;
                        default:
                            try {
                                zb1Var.close();
                                return null;
                            } catch (IOException e4) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e4);
                                return null;
                            }
                    }
                } catch (IOException e5) {
                    e = e5;
                    Log.w("ExifInterface", "IOException occurred during reading a value", e);
                    if (zb1Var != null) {
                        try {
                            zb1Var.close();
                        } catch (IOException e6) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e6);
                        }
                    }
                    return null;
                }
            } catch (IOException e7) {
                e = e7;
                zb1Var = null;
            } catch (Throwable th) {
                th = th;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException e8) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e8);
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream2 = inputStream;
            if (inputStream2 != null) {
                inputStream2.close();
            }
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(ec1.f17961B[this.f242a]);
        sb.append(", data length:");
        return c75.m3880l(sb, this.f245d.length, ")");
    }

    public ac1(byte[] bArr, int i, int i2) {
        this(-1L, bArr, i, i2);
    }
}
