import br.com.swconsultoria.impressao.model.Impressao;
import br.com.swconsultoria.impressao.service.ImpressaoService;
import br.com.swconsultoria.impressao.util.ImpressaoUtil;

public class TesteImpressaoDCe {

    public static void main(String[] args) {
        try {
            //Faça a leitura do Arquivo
            String xml = ImpressaoUtil.leArquivo("D:\\teste\\dce.xml");

            //Aqui está pegando o Layout Padrão
            Impressao impressao = ImpressaoUtil.impressaoPadraoDCe(xml);

            //Faz a impressão em pdf File
            ImpressaoService.impressaoPdfArquivo(impressao, "d:/teste/teste-dce.pdf");

            System.out.println("Impressão Pdf Arquivo OK");
        } catch (Exception e) {
            //Trate seus erros aqui
            e.printStackTrace();
        }
    }
}
