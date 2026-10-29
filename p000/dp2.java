package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.chromium.net.impl.ImplVersion;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class dp2 {

    /* JADX INFO: renamed from: a */
    public long f17254a;

    /* JADX INFO: renamed from: b */
    public Object f17255b;

    /* JADX INFO: renamed from: c */
    public Object f17256c;

    public dp2(dt0 dt0Var, long j, long j2) {
        mr0 mr0Var = new mr0();
        mr0Var.f25164b = -1;
        mr0Var.f25165c = -1;
        mr0Var.f25167e = nr0.CRONET_SOURCE_UNSPECIFIED;
        this.f17256c = mr0Var;
        this.f17255b = dt0Var;
        mr0Var.f25163a = j;
        mr0Var.f25167e = r16.f28959t;
        mr0Var.f25166d = ImplVersion.getCronetVersion();
        this.f17254a = j2;
    }

    /* JADX INFO: renamed from: a */
    public void m4635a(long j, long j2) {
        ((lx4) this.f17255b).m8145a(j, Float.intBitsToFloat((int) (j2 >> 32)));
        ((lx4) this.f17256c).m8145a(j, Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    /* JADX INFO: renamed from: b */
    public List m4636b() {
        List list;
        List list2;
        ar5 ar5Var = (ar5) this.f17256c;
        oa6 oa6Var = (oa6) ar5Var.f36084a;
        ArrayList arrayList = new ArrayList();
        String str = (String) this.f17255b;
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = ar5Var.m3197l0().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime"}, "app_id = ? and rowid > ?", new String[]{str, String.valueOf(this.f17254a)}, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    do {
                        long j = cursorQuery.getLong(0);
                        long j2 = cursorQuery.getLong(3);
                        boolean z = cursorQuery.getLong(5) == 1;
                        byte[] blob = cursorQuery.getBlob(4);
                        if (j > this.f17254a) {
                            this.f17254a = j;
                        }
                        try {
                            l96 l96Var = (l96) q76.m9777k0(m96.m8235y(), blob);
                            String string = cursorQuery.getString(1);
                            if (string == null) {
                                string = "";
                            }
                            l96Var.m11054c();
                            ((m96) l96Var.f31181b).m8240E(string);
                            long j3 = cursorQuery.getLong(2);
                            l96Var.m11054c();
                            ((m96) l96Var.f31181b).m8241F(j3);
                            m96 m96Var = (m96) l96Var.m11056e();
                            qq5 qq5Var = new qq5();
                            qq5Var.f28699a = j;
                            qq5Var.f28700b = j2;
                            qq5Var.f28701c = z;
                            qq5Var.f28702d = m96Var;
                            VarHandle.storeStoreFence();
                            arrayList.add(qq5Var);
                        } catch (IOException e) {
                            d76 d76Var = oa6Var.f26514f;
                            oa6.m9016l(d76Var);
                            d76Var.f16835j.m12506c("Data loss. Failed to merge raw event. appId", d76.m4401y(str), e);
                        }
                    } while (cursorQuery.moveToNext());
                    list = arrayList;
                } else {
                    list2 = Collections.EMPTY_LIST;
                }
            } catch (SQLiteException e2) {
                d76 d76Var2 = oa6Var.f26514f;
                oa6.m9016l(d76Var2);
                d76Var2.f16835j.m12506c("Data loss. Error querying raw events batch. appId", d76.m4401y(str), e2);
                list = arrayList;
            }
            list = list2;
            return list;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }
}
