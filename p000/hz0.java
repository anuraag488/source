package p000;

import ads_mobile_sdk.C0313rh;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;
import org.chromium.net.NetError;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hz0 extends RuntimeException {

    /* JADX INFO: renamed from: a */
    public final yh0 f20949a;

    public hz0(yh0 yh0Var) {
        this.f20949a = yh0Var;
        if (yh0Var.f35221b) {
            return;
        }
        int[] iArr = {C0313rh.f10778d1, 202, 204, 206, 207, 125, NetError.ERR_PROXY_AUTH_REQUESTED, 126665345, 200};
        List list = yh0Var.f35220a;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            ai0 ai0Var = (ai0) list.get(i);
            if (!AbstractC0990oo.m9196Q(iArr, ai0Var.f14518a)) {
                if (ai0Var.f14518a == 100) {
                    int i3 = i + 2;
                    if (i3 < size && ((ai0) list.get(i3)).f14518a == 1000) {
                        break;
                    } else {
                        mb0.m8264E0(arrayList);
                    }
                } else {
                    arrayList.add(ai0Var);
                }
            }
            i = i2;
        }
        int size2 = arrayList.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size2];
        for (int i4 = 0; i4 < size2; i4++) {
            stackTraceElementArr[i4] = new StackTraceElement("$$compose", c75.m3877i(((ai0) arrayList.get(i4)).f14518a, "m$"), "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        yh0 yh0Var = this.f20949a;
        if (!yh0Var.f35221b) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        sl2 sl2VarM7680G = kx5.m7680G();
        List list = yh0Var.f35220a;
        hq2 hq2Var = new hq2((byte) 1);
        hq2Var.f20783b = list;
        VarHandle.storeStoreFence();
        int iMo103a = hq2Var.mo103a();
        for (int i = 0; i < iMo103a; i++) {
            ((ai0) hq2Var.get(i)).getClass();
        }
        sl2 sl2VarM7740w = kx5.m7740w(sl2VarM7680G);
        hq2 hq2Var2 = new hq2((byte) 1);
        hq2Var2.f20783b = sl2VarM7740w;
        VarHandle.storeStoreFence();
        int iMo103a2 = hq2Var2.mo103a();
        for (int i2 = 0; i2 < iMo103a2; i2++) {
            String str = (String) hq2Var2.get(i2);
            sb.append("\tat ");
            sb.append(str);
            sb.append('\n');
        }
        return sb.toString();
    }
}
