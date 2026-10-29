package p000;

import android.content.Context;
import android.content.IntentFilter;
import androidx.compose.p001ui.platform.AndroidCompositionLocals_androidKt;
import java.lang.invoke.VarHandle;
import java.util.Arrays;
import java.util.LinkedHashMap;
import org.chromium.net.NetError;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class r30 {

    /* JADX INFO: renamed from: a */
    public static final LinkedHashMap f28977a = new LinkedHashMap();

    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m10184a(IntentFilter intentFilter, C0950nl c0950nl, Context context, yp1 yp1Var, mi0 mi0Var, int i, int i2) {
        int i3;
        Context context2;
        int i4;
        C0950nl c0950nl2 = c0950nl;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-1665471385);
        if ((i & 6) == 0) {
            i3 = (ir1Var.m6894i(intentFilter) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) != 0) {
                i4 = 16;
            } else {
                if ((i & 64) == 0 ? ir1Var.m6890g(c0950nl2) : ir1Var.m6894i(c0950nl2)) {
                    i4 = 32;
                } else {
                    i4 = 16;
                }
            }
            i3 |= i4;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                context2 = context;
                int i5 = ir1Var.m6894i(context2) ? 256 : 128;
                i3 |= i5;
            } else {
                context2 = context;
            }
            i3 |= i5;
        } else {
            context2 = context;
        }
        if ((i & 3072) == 0) {
            i3 |= ir1Var.m6894i(yp1Var) ? 2048 : 1024;
        }
        byte b = 1;
        if (ir1Var.m6871T(i3 & 1, (i3 & 1171) != 1170)) {
            ir1Var.m6876Y();
            if ((i & 1) == 0 || ir1Var.m6856B()) {
                if ((i2 & 2) != 0) {
                    c0950nl2 = (C0950nl) ir1Var.m6898k(AbstractC0987ol.m9168a());
                    i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                }
                if ((i2 & 4) != 0) {
                    context2 = (Context) ir1Var.m6898k(AndroidCompositionLocals_androidKt.f14651b);
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
            int i6 = i3;
            C0950nl c0950nl3 = c0950nl2;
            ir1Var.m6913s();
            sw2 sw2VarM7369C = k43.m7369C(yp1Var, ir1Var);
            boolean zM6894i = ir1Var.m6894i(intentFilter) | ((((i6 & 112) ^ 48) > 32 && ir1Var.m6894i(c0950nl3)) || (i6 & 48) == 32) | ir1Var.m6894i(context2) | ir1Var.m6890g(sw2VarM7369C);
            Object objM6869O = ir1Var.m6869O();
            if (zM6894i || objM6869O == ki0.f23136a) {
                C1031pe c1031pe = new C1031pe((Object) intentFilter, (Object) c0950nl3, (Object) context2, (Object) sw2VarM7369C, (wm0) null, (byte) 6);
                ir1Var.m6905n0(c1031pe);
                objM6869O = c1031pe;
            }
            lb5.m7928i(intentFilter, c0950nl3, context2, (mq1) objM6869O, ir1Var);
            c0950nl2 = c0950nl3;
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C0944nf c0944nf = new C0944nf(b);
            c0944nf.f25739d = intentFilter;
            c0944nf.f25740e = c0950nl2;
            c0944nf.f25741f = context2;
            c0944nf.f25742g = yp1Var;
            c0944nf.f25737b = i;
            c0944nf.f25738c = i2;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c0944nf;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m10185b(String[] strArr, C0950nl c0950nl, Context context, yp1 yp1Var, mi0 mi0Var, int i) {
        yp1 yp1Var2;
        Object obj;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-165951414);
        int i2 = i | 144 | (ir1Var.m6894i(yp1Var) ? 2048 : 1024);
        ir1Var.m6879a0(-565518112, Integer.valueOf(strArr.length));
        int i3 = i2 | (ir1Var.m6886e(strArr.length) ? 4 : 0);
        for (String str : strArr) {
            i3 |= ir1Var.m6890g(str) ? 4 : 0;
        }
        ir1Var.m6912r(false);
        if ((i3 & 14) == 0) {
            i3 |= 2;
        }
        if (ir1Var.m6871T(i3 & 1, (i3 & 1171) != 1170)) {
            ir1Var.m6876Y();
            if ((i & 1) == 0 || ir1Var.m6856B()) {
                c0950nl = (C0950nl) ir1Var.m6898k(AbstractC0987ol.m9168a());
                context = (Context) ir1Var.m6898k(AndroidCompositionLocals_androidKt.f14651b);
            } else {
                ir1Var.m6874W();
            }
            int i4 = i3 & (-1009);
            C0950nl c0950nl2 = c0950nl;
            ir1Var.m6913s();
            Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
            boolean zM6886e = ir1Var.m6886e(objArrCopyOf.length);
            for (Object obj2 : objArrCopyOf) {
                zM6886e |= ir1Var.m6890g(obj2);
            }
            Object objM6869O = ir1Var.m6869O();
            if (zM6886e || objM6869O == ki0.f23136a) {
                obj = objM6869O;
                IntentFilter intentFilter = new IntentFilter();
                for (String str2 : strArr) {
                    intentFilter.addAction(str2);
                }
                ir1Var.m6905n0(intentFilter);
                obj = intentFilter;
            }
            obj = objM6869O;
            yp1Var2 = yp1Var;
            m10184a((IntentFilter) obj, c0950nl2, context, yp1Var2, ir1Var, i4 & 8176, 0);
            c0950nl = c0950nl2;
        } else {
            yp1Var2 = yp1Var;
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C0613ei c0613ei = new C0613ei((byte) 2);
            c0613ei.f18114d = strArr;
            c0613ei.f18115e = c0950nl;
            c0613ei.f18112b = context;
            c0613ei.f18113c = yp1Var2;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c0613ei;
        }
    }
}
