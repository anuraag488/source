package p000;

import android.util.Base64;
import android.util.JsonReader;
import java.io.IOException;
import java.io.StringReader;
import java.lang.invoke.VarHandle;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vq0 {

    /* JADX INFO: renamed from: a */
    public static final w42 f32797a;

    static {
        w92 w92Var = new w92();
        C0992oq c0992oq = C0992oq.f26947a;
        w92Var.m12169b(tq0.class, c0992oq);
        w92Var.m12169b(C0773is.class, c0992oq);
        C1228uq c1228uq = C1228uq.f32074a;
        w92Var.m12169b(sq0.class, c1228uq);
        w92Var.m12169b(C1119rs.class, c1228uq);
        C1117rq c1117rq = C1117rq.f29520a;
        w92Var.m12169b(aq0.class, c1117rq);
        w92Var.m12169b(C1156ss.class, c1117rq);
        C1154sq c1154sq = C1154sq.f30488a;
        w92Var.m12169b(zp0.class, c1154sq);
        w92Var.m12169b(AbstractC1193ts.class, c1154sq);
        C0845kr c0845kr = C0845kr.f23340a;
        w92Var.m12169b(rq0.class, c0845kr);
        w92Var.m12169b(C1343xt.class, c0845kr);
        C0808jr c0808jr = C0808jr.f22530a;
        w92Var.m12169b(qq0.class, c0808jr);
        w92Var.m12169b(C1306wt.class, c0808jr);
        C1191tq c1191tq = C1191tq.f31321a;
        w92Var.m12169b(bq0.class, c1191tq);
        w92Var.m12169b(C1267vs.class, c1191tq);
        C0622er c0622er = C0622er.f18383a;
        w92Var.m12169b(pq0.class, c0622er);
        w92Var.m12169b(C1342xs.class, c0622er);
        C1265vq c1265vq = C1265vq.f32789a;
        w92Var.m12169b(jq0.class, c1265vq);
        w92Var.m12169b(C1416zs.class, c1265vq);
        C1340xq c1340xq = C1340xq.f34525a;
        w92Var.m12169b(hq0.class, c1340xq);
        w92Var.m12169b(C0466at.class, c1340xq);
        C0464ar c0464ar = C0464ar.f14793a;
        w92Var.m12169b(gq0.class, c0464ar);
        w92Var.m12169b(C0810jt.class, c0464ar);
        C0501br c0501br = C0501br.f15513a;
        w92Var.m12169b(fq0.class, c0501br);
        w92Var.m12169b(C0884lt.class, c0501br);
        C1377yq c1377yq = C1377yq.f35451a;
        w92Var.m12169b(dq0.class, c1377yq);
        w92Var.m12169b(C0625et.class, c1377yq);
        C0918mq c0918mq = C0918mq.f25122a;
        w92Var.m12169b(vp0.class, c0918mq);
        w92Var.m12169b(C0883ls.class, c0918mq);
        C0881lq c0881lq = C0881lq.f24273a;
        w92Var.m12169b(up0.class, c0881lq);
        w92Var.m12169b(C0920ms.class, c0881lq);
        C1414zq c1414zq = C1414zq.f36262a;
        w92Var.m12169b(eq0.class, c1414zq);
        w92Var.m12169b(C0700gt.class, c1414zq);
        C1303wq c1303wq = C1303wq.f33594a;
        w92Var.m12169b(cq0.class, c1303wq);
        w92Var.m12169b(C0550ct.class, c1303wq);
        C0955nq c0955nq = C0955nq.f26027a;
        w92Var.m12169b(wp0.class, c0955nq);
        w92Var.m12169b(C0957ns.class, c0955nq);
        C0548cr c0548cr = C0548cr.f16385a;
        w92Var.m12169b(iq0.class, c0548cr);
        w92Var.m12169b(C0958nt.class, c0548cr);
        C0584dr c0584dr = C0584dr.f17291a;
        w92Var.m12169b(kq0.class, c0584dr);
        w92Var.m12169b(C1046pt.class, c0584dr);
        C0661fr c0661fr = C0661fr.f19232a;
        w92Var.m12169b(lq0.class, c0661fr);
        w92Var.m12169b(C1083qt.class, c0661fr);
        C0772ir c0772ir = C0772ir.f21656a;
        w92Var.m12169b(oq0.class, c0772ir);
        w92Var.m12169b(C1231ut.class, c0772ir);
        C0698gr c0698gr = C0698gr.f20053a;
        w92Var.m12169b(nq0.class, c0698gr);
        w92Var.m12169b(C1157st.class, c0698gr);
        C0735hr c0735hr = C0735hr.f20793a;
        w92Var.m12169b(mq0.class, c0735hr);
        w92Var.m12169b(C1194tt.class, c0735hr);
        C1043pq c1043pq = C1043pq.f27890a;
        w92Var.m12169b(yp0.class, c1043pq);
        w92Var.m12169b(C1008os.class, c1043pq);
        C1080qq c1080qq = C1080qq.f28679a;
        w92Var.m12169b(xp0.class, c1080qq);
        w92Var.m12169b(C1045ps.class, c1080qq);
        w92Var.f33177d = true;
        f32797a = w92Var.m12168a();
    }

    /* JADX INFO: renamed from: a */
    public static C0883ls m11953a(JsonReader jsonReader) throws IOException {
        C0846ks c0846ks = new C0846ks();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildIdMappingForArch":
                    c0846ks.f23377i = m11954b(jsonReader, new nm0((byte) 1));
                    break;
                case "pid":
                    c0846ks.f23369a = jsonReader.nextInt();
                    c0846ks.f23378j = (byte) (c0846ks.f23378j | 1);
                    break;
                case "pss":
                    c0846ks.f23373e = jsonReader.nextLong();
                    c0846ks.f23378j = (byte) (c0846ks.f23378j | 8);
                    break;
                case "rss":
                    c0846ks.f23374f = jsonReader.nextLong();
                    c0846ks.f23378j = (byte) (c0846ks.f23378j | 16);
                    break;
                case "timestamp":
                    c0846ks.f23375g = jsonReader.nextLong();
                    c0846ks.f23378j = (byte) (c0846ks.f23378j | 32);
                    break;
                case "processName":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        xy4.m12782k("Null processName");
                        return null;
                    }
                    c0846ks.f23370b = strNextString;
                    break;
                    break;
                case "reasonCode":
                    c0846ks.f23371c = jsonReader.nextInt();
                    c0846ks.f23378j = (byte) (c0846ks.f23378j | 2);
                    break;
                case "traceFile":
                    c0846ks.f23376h = jsonReader.nextString();
                    break;
                case "importance":
                    c0846ks.f23372d = jsonReader.nextInt();
                    c0846ks.f23378j = (byte) (c0846ks.f23378j | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return c0846ks.m7590a();
    }

    /* JADX INFO: renamed from: b */
    public static List m11954b(JsonReader jsonReader, nm0 nm0Var) throws IOException {
        Object objM11958f;
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            Object objM10424a = null;
            objM10424a = null;
            objM10424a = null;
            objM10424a = null;
            objM10424a = null;
            objM10424a = null;
            objM10424a = null;
            objM10424a = null;
            objM10424a = null;
            objM10424a = null;
            objM10424a = null;
            objM10424a = null;
            objM10424a = null;
            objM10424a = null;
            objM10424a = null;
            switch (nm0Var.f25939a) {
                case 1:
                    jsonReader.beginObject();
                    String strNextString = null;
                    String strNextString2 = null;
                    String strNextString3 = null;
                    while (true) {
                        if (jsonReader.hasNext()) {
                            String strNextName = jsonReader.nextName();
                            strNextName.getClass();
                            switch (strNextName) {
                                case "libraryName":
                                    strNextString2 = jsonReader.nextString();
                                    if (strNextString2 != null) {
                                        break;
                                    } else {
                                        xy4.m12782k("Null libraryName");
                                        break;
                                    }
                                    break;
                                case "arch":
                                    strNextString = jsonReader.nextString();
                                    if (strNextString != null) {
                                        break;
                                    } else {
                                        xy4.m12782k("Null arch");
                                        break;
                                    }
                                    break;
                                case "buildId":
                                    strNextString3 = jsonReader.nextString();
                                    if (strNextString3 != null) {
                                        break;
                                    } else {
                                        xy4.m12782k("Null buildId");
                                        break;
                                    }
                                    break;
                                default:
                                    jsonReader.skipValue();
                                    break;
                            }
                        } else {
                            jsonReader.endObject();
                            if (strNextString == null || strNextString2 == null || strNextString3 == null) {
                                StringBuilder sb = new StringBuilder();
                                if (strNextString == null) {
                                    sb.append(" arch");
                                }
                                if (strNextString2 == null) {
                                    sb.append(" libraryName");
                                }
                                if (strNextString3 == null) {
                                    sb.append(" buildId");
                                }
                                C1077qn.m9989o(d55.m4368m("Missing required properties:", sb));
                            } else {
                                C0920ms c0920ms = new C0920ms();
                                c0920ms.f25176a = strNextString;
                                c0920ms.f25177b = strNextString2;
                                c0920ms.f25178c = strNextString3;
                                VarHandle.storeStoreFence();
                                objM10424a = c0920ms;
                            }
                            break;
                        }
                    }
                    break;
                case 2:
                    jsonReader.beginObject();
                    String strNextString4 = null;
                    byte[] bArrDecode = null;
                    while (true) {
                        if (!jsonReader.hasNext()) {
                            jsonReader.endObject();
                            if (strNextString4 == null || bArrDecode == null) {
                                StringBuilder sb2 = new StringBuilder();
                                if (strNextString4 == null) {
                                    sb2.append(" filename");
                                }
                                if (bArrDecode == null) {
                                    sb2.append(" contents");
                                }
                                C1077qn.m9989o(d55.m4368m("Missing required properties:", sb2));
                            } else {
                                C1045ps c1045ps = new C1045ps();
                                c1045ps.f27927a = strNextString4;
                                c1045ps.f27928b = bArrDecode;
                                VarHandle.storeStoreFence();
                                objM10424a = c1045ps;
                            }
                        } else {
                            String strNextName2 = jsonReader.nextName();
                            strNextName2.getClass();
                            if (strNextName2.equals("filename")) {
                                strNextString4 = jsonReader.nextString();
                                if (strNextString4 == null) {
                                    xy4.m12782k("Null filename");
                                    break;
                                }
                            } else if (strNextName2.equals("contents")) {
                                bArrDecode = Base64.decode(jsonReader.nextString(), 2);
                                if (bArrDecode == null) {
                                    xy4.m12782k("Null contents");
                                    break;
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                            arrayList.add(objM11958f);
                        }
                        break;
                    }
                    break;
                case 3:
                    C1120rt c1120rt = new C1120rt();
                    jsonReader.beginObject();
                    while (true) {
                        if (jsonReader.hasNext()) {
                            String strNextName3 = jsonReader.nextName();
                            strNextName3.getClass();
                            switch (strNextName3) {
                                case "parameterKey":
                                    String strNextString5 = jsonReader.nextString();
                                    if (strNextString5 != null) {
                                        c1120rt.f29591b = strNextString5;
                                        break;
                                    } else {
                                        xy4.m12782k("Null parameterKey");
                                        break;
                                    }
                                    break;
                                case "templateVersion":
                                    c1120rt.f29593d = jsonReader.nextLong();
                                    c1120rt.f29594e = (byte) (c1120rt.f29594e | 1);
                                    break;
                                case "rolloutVariant":
                                    jsonReader.beginObject();
                                    String strNextString6 = null;
                                    String strNextString7 = null;
                                    while (true) {
                                        if (!jsonReader.hasNext()) {
                                            jsonReader.endObject();
                                            if (strNextString6 == null || strNextString7 == null) {
                                                StringBuilder sb3 = new StringBuilder();
                                                if (strNextString6 == null) {
                                                    sb3.append(" rolloutId");
                                                }
                                                if (strNextString7 == null) {
                                                    sb3.append(" variantId");
                                                }
                                                C1077qn.m9989o(d55.m4368m("Missing required properties:", sb3));
                                            } else {
                                                C1194tt c1194tt = new C1194tt();
                                                c1194tt.f31402a = strNextString6;
                                                c1194tt.f31403b = strNextString7;
                                                VarHandle.storeStoreFence();
                                                c1120rt.f29590a = c1194tt;
                                            }
                                        } else {
                                            String strNextName4 = jsonReader.nextName();
                                            strNextName4.getClass();
                                            if (strNextName4.equals("variantId")) {
                                                strNextString7 = jsonReader.nextString();
                                                if (strNextString7 == null) {
                                                    xy4.m12782k("Null variantId");
                                                    break;
                                                }
                                            } else if (strNextName4.equals("rolloutId")) {
                                                strNextString6 = jsonReader.nextString();
                                                if (strNextString6 == null) {
                                                    xy4.m12782k("Null rolloutId");
                                                    break;
                                                }
                                            } else {
                                                jsonReader.skipValue();
                                            }
                                            arrayList.add(objM11958f);
                                        }
                                        break;
                                    }
                                    break;
                                case "parameterValue":
                                    String strNextString8 = jsonReader.nextString();
                                    if (strNextString8 != null) {
                                        c1120rt.f29592c = strNextString8;
                                        break;
                                    } else {
                                        xy4.m12782k("Null parameterValue");
                                        break;
                                    }
                                    break;
                                default:
                                    jsonReader.skipValue();
                                    break;
                            }
                        } else {
                            jsonReader.endObject();
                            objM10424a = c1120rt.m10424a();
                            break;
                        }
                    }
                    break;
                case 4:
                    C0737ht c0737ht = new C0737ht();
                    jsonReader.beginObject();
                    while (true) {
                        if (jsonReader.hasNext()) {
                            String strNextName5 = jsonReader.nextName();
                            strNextName5.getClass();
                            switch (strNextName5) {
                                case "frames":
                                    List listM11954b = m11954b(jsonReader, new nm0((byte) 6));
                                    if (listM11954b != null) {
                                        c0737ht.f20834c = listM11954b;
                                        break;
                                    } else {
                                        xy4.m12782k("Null frames");
                                        break;
                                    }
                                    break;
                                case "name":
                                    String strNextString9 = jsonReader.nextString();
                                    if (strNextString9 != null) {
                                        c0737ht.f20832a = strNextString9;
                                        break;
                                    } else {
                                        xy4.m12782k("Null name");
                                        break;
                                    }
                                    break;
                                case "importance":
                                    c0737ht.f20833b = jsonReader.nextInt();
                                    c0737ht.f20835d = (byte) (c0737ht.f20835d | 1);
                                    break;
                                default:
                                    jsonReader.skipValue();
                                    break;
                            }
                        } else {
                            jsonReader.endObject();
                            objM10424a = c0737ht.m6503a();
                            break;
                        }
                    }
                    break;
                case 5:
                    C0503bt c0503bt = new C0503bt();
                    jsonReader.beginObject();
                    while (true) {
                        if (jsonReader.hasNext()) {
                            String strNextName6 = jsonReader.nextName();
                            strNextName6.getClass();
                            switch (strNextName6) {
                                case "name":
                                    String strNextString10 = jsonReader.nextString();
                                    if (strNextString10 != null) {
                                        c0503bt.f15561c = strNextString10;
                                        break;
                                    } else {
                                        xy4.m12782k("Null name");
                                        break;
                                    }
                                    break;
                                case "size":
                                    c0503bt.f15560b = jsonReader.nextLong();
                                    c0503bt.f15563e = (byte) (c0503bt.f15563e | 2);
                                    break;
                                case "uuid":
                                    c0503bt.f15562d = new String(Base64.decode(jsonReader.nextString(), 2), tq0.f31331a);
                                    break;
                                case "baseAddress":
                                    c0503bt.f15559a = jsonReader.nextLong();
                                    c0503bt.f15563e = (byte) (c0503bt.f15563e | 1);
                                    break;
                                default:
                                    jsonReader.skipValue();
                                    break;
                            }
                        } else {
                            jsonReader.endObject();
                            objM10424a = c0503bt.m3667a();
                            break;
                        }
                    }
                    break;
                default:
                    objM11958f = m11958f(jsonReader);
                    continue;
                    arrayList.add(objM11958f);
                    break;
            }
            objM11958f = objM10424a;
            arrayList.add(objM11958f);
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: c */
    public static C0957ns m11955c(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("key")) {
                strNextString = jsonReader.nextString();
                if (strNextString == null) {
                    xy4.m12782k("Null key");
                    return null;
                }
            } else if (strNextName.equals("value")) {
                strNextString2 = jsonReader.nextString();
                if (strNextString2 == null) {
                    xy4.m12782k("Null value");
                    return null;
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (strNextString != null && strNextString2 != null) {
            C0957ns c0957ns = new C0957ns();
            c0957ns.f26063a = strNextString;
            c0957ns.f26064b = strNextString2;
            VarHandle.storeStoreFence();
            return c0957ns;
        }
        StringBuilder sb = new StringBuilder();
        if (strNextString == null) {
            sb.append(" key");
        }
        if (strNextString2 == null) {
            sb.append(" value");
        }
        C1077qn.m9989o(d55.m4368m("Missing required properties:", sb));
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v25, types: [gt] */
    /* JADX WARN: Type inference failed for: r11v26, types: [gt] */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v42 */
    /* JADX WARN: Type inference failed for: r11v43 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r14v1, types: [et] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [vp0] */
    /* JADX WARN: Type inference failed for: r15v2, types: [ls] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX INFO: renamed from: d */
    public static C1342xs m11956d(JsonReader jsonReader) throws IOException {
        byte b;
        byte b2;
        C1342xs c1342xs;
        byte b3;
        byte b4;
        byte b5;
        byte b6;
        C1305ws c1305ws = new C1305ws();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            byte b7 = 1;
            switch (strNextName) {
                case "device":
                    b = 0;
                    break;
                case "rollouts":
                    b = 1;
                    break;
                case "app":
                    b = 2;
                    break;
                case "log":
                    b = 3;
                    break;
                case "type":
                    b = 4;
                    break;
                case "timestamp":
                    b = 5;
                    break;
                default:
                    b = -1;
                    break;
            }
            C1342xs c1342xs2 = null;
            switch (b) {
                case 0:
                    C1009ot c1009ot = new C1009ot();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        switch (strNextName2) {
                            case "batteryLevel":
                                c1009ot.f27066a = Double.valueOf(jsonReader.nextDouble());
                                break;
                            case "batteryVelocity":
                                c1009ot.f27067b = jsonReader.nextInt();
                                c1009ot.f27072g = (byte) (c1009ot.f27072g | 1);
                                break;
                            case "orientation":
                                c1009ot.f27069d = jsonReader.nextInt();
                                c1009ot.f27072g = (byte) (c1009ot.f27072g | 4);
                                break;
                            case "diskUsed":
                                c1009ot.f27071f = jsonReader.nextLong();
                                c1009ot.f27072g = (byte) (c1009ot.f27072g | 16);
                                break;
                            case "ramUsed":
                                c1009ot.f27070e = jsonReader.nextLong();
                                c1009ot.f27072g = (byte) (c1009ot.f27072g | 8);
                                break;
                            case "proximityOn":
                                c1009ot.f27068c = jsonReader.nextBoolean();
                                c1009ot.f27072g = (byte) (c1009ot.f27072g | 2);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    c1305ws.f33672d = c1009ot.m9262a();
                    break;
                case 1:
                    jsonReader.beginObject();
                    List listM11954b = null;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        if (strNextName3.equals("assignments")) {
                            listM11954b = m11954b(jsonReader, new nm0((byte) 3));
                            if (listM11954b == null) {
                                xy4.m12782k("Null rolloutAssignments");
                                return null;
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (listM11954b == null) {
                        C1077qn.m9989o("Missing required properties: rolloutAssignments");
                        return null;
                    }
                    C1231ut c1231ut = new C1231ut();
                    c1231ut.f32150a = listM11954b;
                    VarHandle.storeStoreFence();
                    c1305ws.f33674f = c1231ut;
                    break;
                    break;
                case 2:
                    C1379ys c1379ys = new C1379ys();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName4 = jsonReader.nextName();
                        strNextName4.getClass();
                        switch (strNextName4.hashCode()) {
                            case -1405314732:
                                b2 = !strNextName4.equals("appProcessDetails") ? (byte) -1 : (byte) 0;
                                break;
                            case -1332194002:
                                b2 = !strNextName4.equals("background") ? (byte) -1 : b7;
                                break;
                            case -1090974952:
                                b2 = !strNextName4.equals("execution") ? (byte) -1 : (byte) 2;
                                break;
                            case -80231855:
                                b2 = !strNextName4.equals("internalKeys") ? (byte) -1 : (byte) 3;
                                break;
                            case 555169704:
                                b2 = !strNextName4.equals("customAttributes") ? (byte) -1 : (byte) 4;
                                break;
                            case 928737948:
                                b2 = !strNextName4.equals("uiOrientation") ? (byte) -1 : (byte) 5;
                                break;
                            case 1847730860:
                                b2 = !strNextName4.equals("currentProcessDetails") ? (byte) -1 : (byte) 6;
                                break;
                            default:
                                b2 = -1;
                                break;
                        }
                        switch (b2) {
                            case 0:
                                c1342xs = c1342xs2;
                                b3 = b7;
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(m11959g(jsonReader));
                                }
                                jsonReader.endArray();
                                c1379ys.f35488f = Collections.unmodifiableList(arrayList);
                                c1342xs2 = c1342xs;
                                b7 = b3;
                                break;
                            case 1:
                                c1342xs = c1342xs2;
                                b3 = b7;
                                c1379ys.f35486d = Boolean.valueOf(jsonReader.nextBoolean());
                                c1342xs2 = c1342xs;
                                b7 = b3;
                                break;
                            case 2:
                                jsonReader.beginObject();
                                C1342xs c1342xs3 = c1342xs2;
                                C1342xs c1342xs4 = c1342xs3;
                                C1342xs c1342xs5 = c1342xs4;
                                C1342xs c1342xs6 = c1342xs5;
                                ?? M11953a = c1342xs6;
                                ?? M5803a = c1342xs3;
                                ?? r12 = c1342xs4;
                                ?? M11954b = c1342xs5;
                                ?? M11957e = c1342xs6;
                                while (jsonReader.hasNext()) {
                                    C1342xs c1342xs7 = c1342xs2;
                                    String strNextName5 = jsonReader.nextName();
                                    strNextName5.getClass();
                                    switch (strNextName5.hashCode()) {
                                        case -1375141843:
                                            b4 = !strNextName5.equals("appExitInfo") ? (byte) -1 : (byte) 0;
                                            break;
                                        case -1337936983:
                                            b4 = !strNextName5.equals("threads") ? (byte) -1 : b7;
                                            break;
                                        case -902467928:
                                            b4 = !strNextName5.equals("signal") ? (byte) -1 : (byte) 2;
                                            break;
                                        case 937615455:
                                            b4 = !strNextName5.equals("binaries") ? (byte) -1 : (byte) 3;
                                            break;
                                        case 1481625679:
                                            b4 = !strNextName5.equals("exception") ? (byte) -1 : (byte) 4;
                                            break;
                                        default:
                                            b4 = -1;
                                            break;
                                    }
                                    switch (b4) {
                                        case 0:
                                            b5 = b7;
                                            M11953a = m11953a(jsonReader);
                                            c1342xs2 = c1342xs7;
                                            b7 = b5;
                                            M5803a = M5803a;
                                            r12 = r12;
                                            M11954b = M11954b;
                                            M11957e = M11957e;
                                            M11953a = M11953a;
                                            break;
                                        case 1:
                                            b5 = b7;
                                            M11954b = m11954b(jsonReader, new nm0((byte) 4));
                                            c1342xs2 = c1342xs7;
                                            b7 = b5;
                                            M5803a = M5803a;
                                            r12 = r12;
                                            M11954b = M11954b;
                                            M11957e = M11957e;
                                            M11953a = M11953a;
                                            break;
                                        case 2:
                                            C0663ft c0663ft = new C0663ft();
                                            jsonReader.beginObject();
                                            while (jsonReader.hasNext()) {
                                                String strNextName6 = jsonReader.nextName();
                                                strNextName6.getClass();
                                                switch (strNextName6.hashCode()) {
                                                    case -1147692044:
                                                        b6 = !strNextName6.equals("address") ? (byte) -1 : (byte) 0;
                                                        break;
                                                    case 3059181:
                                                        b6 = !strNextName6.equals("code") ? (byte) -1 : b7;
                                                        break;
                                                    case 3373707:
                                                        b6 = !strNextName6.equals("name") ? (byte) -1 : (byte) 2;
                                                        break;
                                                    default:
                                                        b6 = -1;
                                                        break;
                                                }
                                                switch (b6) {
                                                    case 0:
                                                        c0663ft.f19267c = jsonReader.nextLong();
                                                        c0663ft.f19268d = (byte) (c0663ft.f19268d | 1);
                                                        b7 = b7;
                                                        break;
                                                    case 1:
                                                        String strNextString = jsonReader.nextString();
                                                        if (strNextString == null) {
                                                            xy4.m12782k("Null code");
                                                            return c1342xs7;
                                                        }
                                                        c0663ft.f19266b = strNextString;
                                                        b7 = b7;
                                                        break;
                                                        break;
                                                    case 2:
                                                        String strNextString2 = jsonReader.nextString();
                                                        if (strNextString2 == null) {
                                                            xy4.m12782k("Null name");
                                                            return c1342xs7;
                                                        }
                                                        c0663ft.f19265a = strNextString2;
                                                        b7 = b7;
                                                        break;
                                                        break;
                                                    default:
                                                        jsonReader.skipValue();
                                                        b7 = b7;
                                                        break;
                                                }
                                            }
                                            b5 = b7;
                                            jsonReader.endObject();
                                            M5803a = c0663ft.m5803a();
                                            c1342xs2 = c1342xs7;
                                            b7 = b5;
                                            M5803a = M5803a;
                                            r12 = r12;
                                            M11954b = M11954b;
                                            M11957e = M11957e;
                                            M11953a = M11953a;
                                            break;
                                        case 3:
                                            List listM11954b2 = m11954b(jsonReader, new nm0((byte) 5));
                                            r12 = listM11954b2;
                                            M11957e = M11957e;
                                            if (listM11954b2 == null) {
                                                xy4.m12782k("Null binaries");
                                                return c1342xs7;
                                            }
                                            b5 = b7;
                                            c1342xs2 = c1342xs7;
                                            b7 = b5;
                                            M5803a = M5803a;
                                            r12 = r12;
                                            M11954b = M11954b;
                                            M11957e = M11957e;
                                            M11953a = M11953a;
                                            break;
                                        case 4:
                                            r12 = r12;
                                            M11957e = m11957e(jsonReader);
                                            b5 = b7;
                                            c1342xs2 = c1342xs7;
                                            b7 = b5;
                                            M5803a = M5803a;
                                            r12 = r12;
                                            M11954b = M11954b;
                                            M11957e = M11957e;
                                            M11953a = M11953a;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            r12 = r12;
                                            M11957e = M11957e;
                                            b5 = b7;
                                            c1342xs2 = c1342xs7;
                                            b7 = b5;
                                            M5803a = M5803a;
                                            r12 = r12;
                                            M11954b = M11954b;
                                            M11957e = M11957e;
                                            M11953a = M11953a;
                                            break;
                                    }
                                }
                                c1342xs = c1342xs2;
                                b3 = b7;
                                jsonReader.endObject();
                                if (M5803a == 0 || r12 == 0) {
                                    StringBuilder sb = new StringBuilder();
                                    if (M5803a == 0) {
                                        sb.append(" signal");
                                    }
                                    if (r12 == 0) {
                                        sb.append(" binaries");
                                    }
                                    C1077qn.m9989o(d55.m4368m("Missing required properties:", sb));
                                    return c1342xs;
                                }
                                C0466at c0466at = new C0466at();
                                c0466at.f14847a = M11954b;
                                c0466at.f14848b = M11957e;
                                c0466at.f14849c = M11953a;
                                c0466at.f14850d = M5803a;
                                c0466at.f14851e = r12;
                                VarHandle.storeStoreFence();
                                c1379ys.f35483a = c0466at;
                                c1342xs2 = c1342xs;
                                b7 = b3;
                                break;
                            case 3:
                                ArrayList arrayList2 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList2.add(m11955c(jsonReader));
                                }
                                jsonReader.endArray();
                                c1379ys.f35485c = Collections.unmodifiableList(arrayList2);
                                c1342xs = c1342xs2;
                                b3 = b7;
                                c1342xs2 = c1342xs;
                                b7 = b3;
                                break;
                            case 4:
                                ArrayList arrayList3 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList3.add(m11955c(jsonReader));
                                }
                                jsonReader.endArray();
                                c1379ys.f35484b = Collections.unmodifiableList(arrayList3);
                                c1342xs = c1342xs2;
                                b3 = b7;
                                c1342xs2 = c1342xs;
                                b7 = b3;
                                break;
                            case 5:
                                c1379ys.f35489g = jsonReader.nextInt();
                                c1379ys.f35490h = (byte) (c1379ys.f35490h | b7);
                                c1342xs = c1342xs2;
                                b3 = b7;
                                c1342xs2 = c1342xs;
                                b7 = b3;
                                break;
                            case 6:
                                c1379ys.f35487e = m11959g(jsonReader);
                                c1342xs = c1342xs2;
                                b3 = b7;
                                c1342xs2 = c1342xs;
                                b7 = b3;
                                break;
                            default:
                                jsonReader.skipValue();
                                c1342xs = c1342xs2;
                                b3 = b7;
                                c1342xs2 = c1342xs;
                                b7 = b3;
                                break;
                        }
                    }
                    jsonReader.endObject();
                    c1305ws.f33671c = c1379ys.m13230a();
                    break;
                case 3:
                    jsonReader.beginObject();
                    String strNextString3 = null;
                    while (jsonReader.hasNext()) {
                        if (jsonReader.nextName().equals("content")) {
                            strNextString3 = jsonReader.nextString();
                            if (strNextString3 == null) {
                                xy4.m12782k("Null content");
                                return null;
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (strNextString3 == null) {
                        C1077qn.m9989o("Missing required properties: content");
                        return null;
                    }
                    C1083qt c1083qt = new C1083qt();
                    c1083qt.f28779a = strNextString3;
                    VarHandle.storeStoreFence();
                    c1305ws.f33673e = c1083qt;
                    break;
                    break;
                case 4:
                    String strNextString4 = jsonReader.nextString();
                    if (strNextString4 == null) {
                        xy4.m12782k("Null type");
                        return null;
                    }
                    c1305ws.f33670b = strNextString4;
                    break;
                    break;
                case 5:
                    c1305ws.f33669a = jsonReader.nextLong();
                    c1305ws.f33675g = (byte) (c1305ws.f33675g | 1);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return c1305ws.m12388a();
    }

    /* JADX INFO: renamed from: e */
    public static C0625et m11957e(JsonReader jsonReader) throws IOException {
        C0586dt c0586dt = new C0586dt();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    List listM11954b = m11954b(jsonReader, new nm0((byte) 6));
                    if (listM11954b == null) {
                        xy4.m12782k("Null frames");
                        return null;
                    }
                    c0586dt.f17339c = listM11954b;
                    break;
                    break;
                case "reason":
                    c0586dt.f17338b = jsonReader.nextString();
                    break;
                case "type":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        xy4.m12782k("Null type");
                        return null;
                    }
                    c0586dt.f17337a = strNextString;
                    break;
                    break;
                case "causedBy":
                    c0586dt.f17340d = m11957e(jsonReader);
                    break;
                case "overflowCount":
                    c0586dt.f17341e = jsonReader.nextInt();
                    c0586dt.f17342f = (byte) (c0586dt.f17342f | 1);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return c0586dt.m4678a();
    }

    /* JADX INFO: renamed from: f */
    public static C0884lt m11958f(JsonReader jsonReader) throws IOException {
        C0847kt c0847kt = new C0847kt();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "offset":
                    c0847kt.f23410d = jsonReader.nextLong();
                    c0847kt.f23412f = (byte) (c0847kt.f23412f | 2);
                    break;
                case "symbol":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        xy4.m12782k("Null symbol");
                        return null;
                    }
                    c0847kt.f23408b = strNextString;
                    break;
                    break;
                case "pc":
                    c0847kt.f23407a = jsonReader.nextLong();
                    c0847kt.f23412f = (byte) (c0847kt.f23412f | 1);
                    break;
                case "file":
                    c0847kt.f23409c = jsonReader.nextString();
                    break;
                case "importance":
                    c0847kt.f23411e = jsonReader.nextInt();
                    c0847kt.f23412f = (byte) (c0847kt.f23412f | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return c0847kt.m7627a();
    }

    /* JADX INFO: renamed from: g */
    public static C0958nt m11959g(JsonReader jsonReader) throws IOException {
        C0921mt c0921mt = new C0921mt();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "pid":
                    c0921mt.f25182b = jsonReader.nextInt();
                    c0921mt.f25185e = (byte) (c0921mt.f25185e | 1);
                    break;
                case "processName":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        xy4.m12782k("Null processName");
                        return null;
                    }
                    c0921mt.f25181a = strNextString;
                    break;
                    break;
                case "defaultProcess":
                    c0921mt.f25184d = jsonReader.nextBoolean();
                    c0921mt.f25185e = (byte) (c0921mt.f25185e | 4);
                    break;
                case "importance":
                    c0921mt.f25183c = jsonReader.nextInt();
                    c0921mt.f25185e = (byte) (c0921mt.f25185e | 2);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return c0921mt.m8390a();
    }

    /* JADX WARN: Code duplicated, block: B:147:0x021a A[PHI: r26
  0x021a: PHI (r26v19 java.lang.String) = 
  (r26v9 java.lang.String)
  (r26v10 java.lang.String)
  (r26v11 java.lang.String)
  (r26v12 java.lang.String)
  (r26v14 java.lang.String)
  (r26v16 java.lang.String)
  (r26v20 java.lang.String)
 binds: [B:169:0x0261, B:165:0x0255, B:161:0x0247, B:493:?, B:492:?, B:491:?, B:146:0x0218] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: h */
    public static C0773is m11960h(JsonReader jsonReader) throws IOException {
        byte b;
        byte b2;
        String str;
        String str2;
        byte b3;
        byte b4;
        String str3;
        byte b5;
        Charset charset = tq0.f31331a;
        C0736hs c0736hs = new C0736hs();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            String str4 = "displayVersion";
            byte b6 = 2;
            switch (strNextName) {
                case "ndkPayload":
                    b = 0;
                    break;
                case "sdkVersion":
                    b = 1;
                    break;
                case "appQualitySessionId":
                    b = 2;
                    break;
                case "appExitInfo":
                    b = 3;
                    break;
                case "buildVersion":
                    b = 4;
                    break;
                case "firebaseAuthenticationToken":
                    b = 5;
                    break;
                case "gmpAppId":
                    b = 6;
                    break;
                case "installationUuid":
                    b = 7;
                    break;
                case "firebaseInstallationId":
                    b = 8;
                    break;
                case "platform":
                    b = 9;
                    break;
                case "displayVersion":
                    b = 10;
                    break;
                case "session":
                    b = 11;
                    break;
                default:
                    b = -1;
                    break;
            }
            String str5 = "Null buildVersion";
            switch (b) {
                case 0:
                    jsonReader.beginObject();
                    List listM11954b = null;
                    String strNextString = null;
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals("files")) {
                            listM11954b = m11954b(jsonReader, new nm0((byte) 2));
                            if (listM11954b == null) {
                                xy4.m12782k("Null files");
                                return null;
                            }
                        } else if (strNextName2.equals("orgId")) {
                            strNextString = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (listM11954b == null) {
                        C1077qn.m9989o("Missing required properties: files");
                        return null;
                    }
                    C1008os c1008os = new C1008os();
                    c1008os.f27049a = listM11954b;
                    c1008os.f27050b = strNextString;
                    VarHandle.storeStoreFence();
                    c0736hs.f20820k = c1008os;
                    continue;
                    break;
                case 1:
                    String strNextString2 = jsonReader.nextString();
                    if (strNextString2 == null) {
                        xy4.m12782k("Null sdkVersion");
                        return null;
                    }
                    c0736hs.f20810a = strNextString2;
                    break;
                    break;
                case 2:
                    c0736hs.f20816g = jsonReader.nextString();
                    break;
                case 3:
                    c0736hs.f20821l = m11953a(jsonReader);
                    break;
                case 4:
                    String strNextString3 = jsonReader.nextString();
                    if (strNextString3 == null) {
                        xy4.m12782k("Null buildVersion");
                        return null;
                    }
                    c0736hs.f20817h = strNextString3;
                    break;
                    break;
                case 5:
                    c0736hs.f20815f = jsonReader.nextString();
                    break;
                case 6:
                    String strNextString4 = jsonReader.nextString();
                    if (strNextString4 == null) {
                        xy4.m12782k("Null gmpAppId");
                        return null;
                    }
                    c0736hs.f20811b = strNextString4;
                    break;
                    break;
                case 7:
                    String strNextString5 = jsonReader.nextString();
                    if (strNextString5 == null) {
                        xy4.m12782k("Null installationUuid");
                        return null;
                    }
                    c0736hs.f20813d = strNextString5;
                    break;
                    break;
                case 8:
                    c0736hs.f20814e = jsonReader.nextString();
                    break;
                case 9:
                    c0736hs.f20812c = jsonReader.nextInt();
                    c0736hs.f20822m = (byte) (c0736hs.f20822m | 1);
                    break;
                case 10:
                    String strNextString6 = jsonReader.nextString();
                    if (strNextString6 == null) {
                        xy4.m12782k("Null displayVersion");
                        return null;
                    }
                    c0736hs.f20818i = strNextString6;
                    break;
                    break;
                case 11:
                    C1082qs c1082qs = new C1082qs();
                    c1082qs.f28736f = false;
                    c1082qs.f28743m = (byte) (c1082qs.f28743m | 2);
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        switch (strNextName3.hashCode()) {
                            case -2128794476:
                                b2 = !strNextName3.equals("startedAt") ? (byte) -1 : (byte) 0;
                                break;
                            case -1907185581:
                                b2 = !strNextName3.equals("appQualitySessionId") ? (byte) -1 : (byte) 1;
                                break;
                            case -1618432855:
                                b2 = !strNextName3.equals("identifier") ? (byte) -1 : b6;
                                break;
                            case -1606742899:
                                b2 = !strNextName3.equals("endedAt") ? (byte) -1 : (byte) 3;
                                break;
                            case -1335157162:
                                b2 = !strNextName3.equals("device") ? (byte) -1 : (byte) 4;
                                break;
                            case -1291329255:
                                b2 = !strNextName3.equals("events") ? (byte) -1 : (byte) 5;
                                break;
                            case 3556:
                                b2 = !strNextName3.equals("os") ? (byte) -1 : (byte) 6;
                                break;
                            case 96801:
                                b2 = !strNextName3.equals("app") ? (byte) -1 : (byte) 7;
                                break;
                            case 3599307:
                                b2 = !strNextName3.equals("user") ? (byte) -1 : (byte) 8;
                                break;
                            case 286956243:
                                b2 = !strNextName3.equals("generator") ? (byte) -1 : (byte) 9;
                                break;
                            case 1025385094:
                                b2 = !strNextName3.equals("crashed") ? (byte) -1 : (byte) 10;
                                break;
                            case 2047016109:
                                b2 = !strNextName3.equals("generatorType") ? (byte) -1 : (byte) 11;
                                break;
                            default:
                                b2 = -1;
                                break;
                        }
                        switch (b2) {
                            case 0:
                                str = str5;
                                str2 = str4;
                                c1082qs.f28734d = jsonReader.nextLong();
                                c1082qs.f28743m = (byte) (c1082qs.f28743m | 1);
                                str5 = str;
                                str4 = str2;
                                b6 = 2;
                                break;
                            case 1:
                                str = str5;
                                str2 = str4;
                                c1082qs.f28733c = jsonReader.nextString();
                                str5 = str;
                                str4 = str2;
                                b6 = 2;
                                break;
                            case 2:
                                str = str5;
                                str2 = str4;
                                c1082qs.f28732b = new String(Base64.decode(jsonReader.nextString(), b6), tq0.f31331a);
                                str5 = str;
                                str4 = str2;
                                b6 = 2;
                                break;
                            case 3:
                                str = str5;
                                str2 = str4;
                                c1082qs.f28735e = Long.valueOf(jsonReader.nextLong());
                                str5 = str;
                                str4 = str2;
                                b6 = 2;
                                break;
                            case 4:
                                str = str5;
                                byte b7 = b6;
                                str2 = str4;
                                C1230us c1230us = new C1230us();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName4 = jsonReader.nextName();
                                    strNextName4.getClass();
                                    switch (strNextName4.hashCode()) {
                                        case -1981332476:
                                            b3 = !strNextName4.equals("simulator") ? (byte) -1 : (byte) 0;
                                            break;
                                        case -1969347631:
                                            b3 = !strNextName4.equals("manufacturer") ? (byte) -1 : (byte) 1;
                                            break;
                                        case 112670:
                                            b3 = !strNextName4.equals("ram") ? (byte) -1 : b7;
                                            break;
                                        case 3002454:
                                            b3 = !strNextName4.equals("arch") ? (byte) -1 : (byte) 3;
                                            break;
                                        case 81784169:
                                            b3 = !strNextName4.equals("diskSpace") ? (byte) -1 : (byte) 4;
                                            break;
                                        case 94848180:
                                            b3 = !strNextName4.equals("cores") ? (byte) -1 : (byte) 5;
                                            break;
                                        case 104069929:
                                            b3 = !strNextName4.equals("model") ? (byte) -1 : (byte) 6;
                                            break;
                                        case 109757585:
                                            b3 = !strNextName4.equals("state") ? (byte) -1 : (byte) 7;
                                            break;
                                        case 2078953423:
                                            b3 = !strNextName4.equals("modelClass") ? (byte) -1 : (byte) 8;
                                            break;
                                        default:
                                            b3 = -1;
                                            break;
                                    }
                                    switch (b3) {
                                        case 0:
                                            c1230us.f32135f = jsonReader.nextBoolean();
                                            c1230us.f32139j = (byte) (c1230us.f32139j | 16);
                                            break;
                                        case 1:
                                            String strNextString7 = jsonReader.nextString();
                                            if (strNextString7 == null) {
                                                xy4.m12782k("Null manufacturer");
                                                return null;
                                            }
                                            c1230us.f32137h = strNextString7;
                                            break;
                                            break;
                                        case 2:
                                            c1230us.f32133d = jsonReader.nextLong();
                                            c1230us.f32139j = (byte) (c1230us.f32139j | 4);
                                            break;
                                        case 3:
                                            c1230us.f32130a = jsonReader.nextInt();
                                            c1230us.f32139j = (byte) (c1230us.f32139j | 1);
                                            break;
                                        case 4:
                                            c1230us.f32134e = jsonReader.nextLong();
                                            c1230us.f32139j = (byte) (c1230us.f32139j | 8);
                                            break;
                                        case 5:
                                            c1230us.f32132c = jsonReader.nextInt();
                                            c1230us.f32139j = (byte) (c1230us.f32139j | 2);
                                            break;
                                        case 6:
                                            String strNextString8 = jsonReader.nextString();
                                            if (strNextString8 == null) {
                                                xy4.m12782k("Null model");
                                                return null;
                                            }
                                            c1230us.f32131b = strNextString8;
                                            break;
                                            break;
                                        case 7:
                                            c1230us.f32136g = jsonReader.nextInt();
                                            c1230us.f32139j = (byte) (c1230us.f32139j | 32);
                                            break;
                                        case 8:
                                            String strNextString9 = jsonReader.nextString();
                                            if (strNextString9 == null) {
                                                xy4.m12782k("Null modelClass");
                                                return null;
                                            }
                                            c1230us.f32138i = strNextString9;
                                            break;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                c1082qs.f28740j = c1230us.m11638a();
                                str5 = str;
                                str4 = str2;
                                b6 = 2;
                                break;
                            case 5:
                                str = str5;
                                str2 = str4;
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(m11956d(jsonReader));
                                }
                                jsonReader.endArray();
                                c1082qs.f28741k = Collections.unmodifiableList(arrayList);
                                str5 = str;
                                str4 = str2;
                                b6 = 2;
                                break;
                            case 6:
                                str = str5;
                                byte b8 = b6;
                                str2 = str4;
                                C1268vt c1268vt = new C1268vt();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName5 = jsonReader.nextName();
                                    strNextName5.getClass();
                                    switch (strNextName5.hashCode()) {
                                        case -911706486:
                                            b4 = !strNextName5.equals("buildVersion") ? (byte) -1 : (byte) 0;
                                            break;
                                        case -293026577:
                                            b4 = !strNextName5.equals("jailbroken") ? (byte) -1 : (byte) 1;
                                            break;
                                        case 351608024:
                                            b4 = !strNextName5.equals("version") ? (byte) -1 : b8;
                                            break;
                                        case 1874684019:
                                            b4 = !strNextName5.equals("platform") ? (byte) -1 : (byte) 3;
                                            break;
                                        default:
                                            b4 = -1;
                                            break;
                                    }
                                    switch (b4) {
                                        case 0:
                                            String strNextString10 = jsonReader.nextString();
                                            if (strNextString10 == null) {
                                                xy4.m12782k(str);
                                                return null;
                                            }
                                            c1268vt.f32847c = strNextString10;
                                            break;
                                            break;
                                        case 1:
                                            c1268vt.f32848d = jsonReader.nextBoolean();
                                            c1268vt.f32849e = (byte) (c1268vt.f32849e | 2);
                                            break;
                                        case 2:
                                            String strNextString11 = jsonReader.nextString();
                                            if (strNextString11 == null) {
                                                xy4.m12782k("Null version");
                                                return null;
                                            }
                                            c1268vt.f32846b = strNextString11;
                                            break;
                                            break;
                                        case 3:
                                            c1268vt.f32845a = jsonReader.nextInt();
                                            c1268vt.f32849e = (byte) (c1268vt.f32849e | 1);
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                c1082qs.f28739i = c1268vt.m11986a();
                                str5 = str;
                                str4 = str2;
                                b6 = 2;
                                break;
                            case 7:
                                jsonReader.beginObject();
                                byte b9 = b6;
                                String strNextString12 = null;
                                String strNextString13 = null;
                                String strNextString14 = null;
                                String strNextString15 = null;
                                String strNextString16 = null;
                                String strNextString17 = null;
                                while (jsonReader.hasNext()) {
                                    String str6 = str5;
                                    String strNextName6 = jsonReader.nextName();
                                    strNextName6.getClass();
                                    switch (strNextName6.hashCode()) {
                                        case -1618432855:
                                            str3 = str4;
                                            if (!strNextName6.equals("identifier")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 0;
                                            }
                                            break;
                                        case -519438642:
                                            str3 = str4;
                                            if (!strNextName6.equals("developmentPlatform")) {
                                                b5 = -1;
                                            } else {
                                                b5 = 1;
                                            }
                                            break;
                                        case 213652010:
                                            str3 = str4;
                                            if (!strNextName6.equals("developmentPlatformVersion")) {
                                                b5 = -1;
                                            } else {
                                                b5 = b9;
                                            }
                                            break;
                                        case 351608024:
                                            if (!strNextName6.equals("version")) {
                                                str3 = str4;
                                                b5 = -1;
                                            } else {
                                                str3 = str4;
                                                b5 = 3;
                                            }
                                            break;
                                        case 719853845:
                                            if (!strNextName6.equals("installationUuid")) {
                                                str3 = str4;
                                                b5 = -1;
                                            } else {
                                                str3 = str4;
                                                b5 = 4;
                                            }
                                            break;
                                        case 1975623094:
                                            if (!strNextName6.equals(str4)) {
                                                str3 = str4;
                                                b5 = -1;
                                            } else {
                                                str3 = str4;
                                                b5 = 5;
                                            }
                                            break;
                                        default:
                                            str3 = str4;
                                            b5 = -1;
                                            break;
                                    }
                                    switch (b5) {
                                        case 0:
                                            strNextString12 = jsonReader.nextString();
                                            if (strNextString12 == null) {
                                                xy4.m12782k("Null identifier");
                                                return null;
                                            }
                                            break;
                                            break;
                                        case 1:
                                            strNextString17 = jsonReader.nextString();
                                            break;
                                        case 2:
                                            strNextString13 = jsonReader.nextString();
                                            break;
                                        case 3:
                                            strNextString14 = jsonReader.nextString();
                                            if (strNextString14 == null) {
                                                xy4.m12782k("Null version");
                                                return null;
                                            }
                                            break;
                                            break;
                                        case 4:
                                            strNextString16 = jsonReader.nextString();
                                            break;
                                        case 5:
                                            strNextString15 = jsonReader.nextString();
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                    str5 = str6;
                                    str4 = str3;
                                }
                                str = str5;
                                str2 = str4;
                                jsonReader.endObject();
                                if (strNextString12 == null || strNextString14 == null) {
                                    StringBuilder sb = new StringBuilder();
                                    if (strNextString12 == null) {
                                        sb.append(" identifier");
                                    }
                                    if (strNextString14 == null) {
                                        sb.append(" version");
                                    }
                                    C1077qn.m9989o(d55.m4368m("Missing required properties:", sb));
                                    return null;
                                }
                                C1156ss c1156ss = new C1156ss();
                                c1156ss.f30531a = strNextString12;
                                c1156ss.f30532b = strNextString14;
                                c1156ss.f30533c = strNextString15;
                                c1156ss.f30534d = strNextString16;
                                c1156ss.f30535e = strNextString17;
                                c1156ss.f30536f = strNextString13;
                                VarHandle.storeStoreFence();
                                c1082qs.f28737g = c1156ss;
                                str5 = str;
                                str4 = str2;
                                b6 = 2;
                                break;
                            case 8:
                                jsonReader.beginObject();
                                String strNextString18 = null;
                                while (jsonReader.hasNext()) {
                                    if (jsonReader.nextName().equals("identifier")) {
                                        strNextString18 = jsonReader.nextString();
                                        if (strNextString18 == null) {
                                            xy4.m12782k("Null identifier");
                                            return null;
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                if (strNextString18 == null) {
                                    C1077qn.m9989o("Missing required properties: identifier");
                                    return null;
                                }
                                C1343xt c1343xt = new C1343xt();
                                c1343xt.f34611a = strNextString18;
                                VarHandle.storeStoreFence();
                                c1082qs.f28738h = c1343xt;
                                str = str5;
                                str2 = str4;
                                str5 = str;
                                str4 = str2;
                                b6 = 2;
                                break;
                                break;
                            case 9:
                                String strNextString19 = jsonReader.nextString();
                                if (strNextString19 == null) {
                                    xy4.m12782k("Null generator");
                                    return null;
                                }
                                c1082qs.f28731a = strNextString19;
                                str = str5;
                                str2 = str4;
                                str5 = str;
                                str4 = str2;
                                b6 = 2;
                                break;
                                break;
                            case 10:
                                c1082qs.f28736f = jsonReader.nextBoolean();
                                c1082qs.f28743m = (byte) (c1082qs.f28743m | b6);
                                str = str5;
                                str2 = str4;
                                str5 = str;
                                str4 = str2;
                                b6 = 2;
                                break;
                            case 11:
                                c1082qs.f28742l = jsonReader.nextInt();
                                c1082qs.f28743m = (byte) (c1082qs.f28743m | 4);
                                str = str5;
                                str2 = str4;
                                str5 = str;
                                str4 = str2;
                                b6 = 2;
                                break;
                            default:
                                jsonReader.skipValue();
                                str = str5;
                                str2 = str4;
                                str5 = str;
                                str4 = str2;
                                b6 = 2;
                                break;
                        }
                    }
                    jsonReader.endObject();
                    c0736hs.f20819j = c1082qs.m10049a();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return c0736hs.m6491a();
    }

    /* JADX INFO: renamed from: i */
    public static C0773is m11961i(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                C0773is c0773isM11960h = m11960h(jsonReader);
                jsonReader.close();
                return c0773isM11960h;
            } catch (Throwable th) {
                try {
                    jsonReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }
}
