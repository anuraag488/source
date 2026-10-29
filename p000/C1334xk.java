package p000;

import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: xk */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class C1334xk extends Exception {

    /* JADX INFO: renamed from: a */
    public final Status f34324a;

    public C1334xk(Status status) {
        int i = status.f16228d;
        String str = status.f16229e;
        str = str == null ? "" : str;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 2 + String.valueOf(str).length());
        sb.append(i);
        sb.append(": ");
        sb.append(str);
        super(sb.toString());
        this.f34324a = status;
    }
}
