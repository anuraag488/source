package p000;

import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class th6 implements Cloneable {

    /* JADX INFO: renamed from: a */
    public final zh6 f31180a;

    /* JADX INFO: renamed from: b */
    public zh6 f31181b;

    public th6(zh6 zh6Var) {
        this.f31180a = zh6Var;
        if (zh6Var.m13566d()) {
            C1077qn.m9987m("Default instance must be immutable.");
            throw null;
        }
        this.f31181b = (zh6) zh6Var.mo97n(4);
    }

    /* JADX INFO: renamed from: a */
    public static void m11052a(List list, int i) {
        int size = list.size() - i;
        StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 26);
        sb.append("Element at index ");
        sb.append(size);
        sb.append(" is null.");
        String string = sb.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i) {
                throw new NullPointerException(string);
            }
            list.remove(size2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m11053b(Iterable iterable, List list) {
        Charset charset = ni6.f25875a;
        iterable.getClass();
        if (iterable instanceof ui6) {
            List listM11566f = ((ui6) iterable).m11566f();
            ui6 ui6Var = (ui6) list;
            int size = list.size();
            for (Object obj : listM11566f) {
                if (obj == null) {
                    int size2 = ui6Var.size() - size;
                    StringBuilder sb = new StringBuilder(String.valueOf(size2).length() + 26);
                    sb.append("Element at index ");
                    sb.append(size2);
                    sb.append(" is null.");
                    String string = sb.toString();
                    int size3 = ui6Var.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            xy4.m12782k(string);
                            return;
                        }
                        ui6Var.remove(size3);
                    }
                } else if (obj instanceof ig6) {
                    ui6Var.m11568j();
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    ig6.m6803e(bArr, 0, bArr.length);
                    ui6Var.m11568j();
                } else {
                    ui6Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof zj6) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size4 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size4);
            } else if (list instanceof ck6) {
                ck6 ck6Var = (ck6) list;
                int i = ck6Var.f16095c + size4;
                int length = ck6Var.f16094b.length;
                if (i > length) {
                    if (length != 0) {
                        while (length < i) {
                            length = zi4.m13610j(length, 3, 2, 1, 10);
                        }
                        ck6Var.f16094b = Arrays.copyOf(ck6Var.f16094b, length);
                    } else {
                        ck6Var.f16094b = new Object[Math.max(i, 10)];
                    }
                }
            }
        }
        int size5 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    m11052a(list, size5);
                    throw null;
                }
                list.add(obj2);
            }
            return;
        }
        List list2 = (List) iterable;
        int size6 = list2.size();
        for (int i2 = 0; i2 < size6; i2++) {
            Object obj3 = list2.get(i2);
            if (obj3 == null) {
                m11052a(list, size5);
                throw null;
            }
            list.add(obj3);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m11054c() {
        if (this.f31181b.m13566d()) {
            return;
        }
        zh6 zh6Var = (zh6) this.f31180a.mo97n(4);
        bk6.f15375c.m3613a(zh6Var.getClass()).mo6031i(zh6Var, this.f31181b);
        this.f31181b = zh6Var;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final th6 clone() {
        th6 th6Var = (th6) this.f31180a.mo97n(5);
        boolean zM13566d = this.f31181b.m13566d();
        zh6 zh6Var = this.f31181b;
        if (zM13566d) {
            zh6Var.getClass();
            bk6.f15375c.m3613a(zh6Var.getClass()).mo6025c(zh6Var);
            zh6Var.m13567e();
            zh6Var = this.f31181b;
        }
        th6Var.f31181b = zh6Var;
        return th6Var;
    }

    /* JADX INFO: renamed from: e */
    public final zh6 m11056e() {
        boolean zM13566d = this.f31181b.m13566d();
        zh6 zh6Var = this.f31181b;
        if (zM13566d) {
            zh6Var.getClass();
            bk6.f15375c.m3613a(zh6Var.getClass()).mo6025c(zh6Var);
            zh6Var.m13567e();
            zh6Var = this.f31181b;
        }
        zh6Var.getClass();
        boolean zMo6024b = true;
        byte bByteValue = ((Byte) zh6Var.mo97n(1)).byteValue();
        if (bByteValue != 1) {
            if (bByteValue == 0) {
                zMo6024b = false;
            } else {
                zMo6024b = bk6.f15375c.m3613a(zh6Var.getClass()).mo6024b(zh6Var);
                zh6Var.mo97n(2);
            }
        }
        if (zMo6024b) {
            return zh6Var;
        }
        throw new gf0("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    /* JADX INFO: renamed from: f */
    public final void m11057f(zh6 zh6Var) {
        zh6 zh6Var2 = this.f31180a;
        if (zh6Var2.equals(zh6Var)) {
            return;
        }
        if (!this.f31181b.m13566d()) {
            zh6 zh6Var3 = (zh6) zh6Var2.mo97n(4);
            bk6.f15375c.m3613a(zh6Var3.getClass()).mo6031i(zh6Var3, this.f31181b);
            this.f31181b = zh6Var3;
        }
        zh6 zh6Var4 = this.f31181b;
        bk6.f15375c.m3613a(zh6Var4.getClass()).mo6031i(zh6Var4, zh6Var);
    }

    /* JADX INFO: renamed from: g */
    public final void m11058g(byte[] bArr, int i, ah6 ah6Var) throws qi6 {
        if (!this.f31181b.m13566d()) {
            zh6 zh6Var = (zh6) this.f31180a.mo97n(4);
            bk6.f15375c.m3613a(zh6Var.getClass()).mo6031i(zh6Var, this.f31181b);
            this.f31181b = zh6Var;
        }
        try {
            gk6 gk6VarM3613a = bk6.f15375c.m3613a(this.f31181b.getClass());
            zh6 zh6Var2 = this.f31181b;
            C1411zn c1411zn = new C1411zn();
            ah6Var.getClass();
            VarHandle.storeStoreFence();
            gk6VarM3613a.mo6030h(zh6Var2, bArr, 0, i, c1411zn);
        } catch (qi6 e) {
            throw e;
        } catch (IOException e2) {
            xy4.m12785n("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            qm5.m9918i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
